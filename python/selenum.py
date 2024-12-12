from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.chrome.options import Options
import time 

import requests
# 크롤링하기 위한 improt
from bs4 import BeautifulSoup
import math
import pandas as pd
import pickle

# 구글로 driver 설정 
#driver = webdriver.Chrome()
#driver.set_window_size(1600, 980)
#driver.get('https://www.google.co.kr/')

# 구글의 검색창을 가지고 옴 
#search_box = driver.find_element(By.XPATH,'//*[@id="APjFqb"]')
# 검색창의 XPATH를 가지고 와 검색어를 자동으로 검색한다.
#search_box.send_keys('셀레니움')
#search_box.send_keys(Keys.ENTER)
#time.sleep(30)

# 다나와에서 노트북 정보 가지고 오기 

#1 다나와 사이트 들어가기
driver = webdriver.Chrome()
driver.set_window_size(1600,900)
url = 'https://www.danawa.com/?k1=%EB%85%B8%ED%8A%B8%EB%B6%81&module=goods&act=dispMain'
driver.get(url)

# 노트북 검색하기
search_noteBook = driver.find_element(By.XPATH, '//*[@id="AKCSearch"]' )
search_noteBook.send_keys('게이밍 노트북')
search_noteBook.send_keys(Keys.ENTER)

# 노트북을 검색하는데 제조사 'ASUS', 'hp', '레노버'를 크롤링하겠습니다.
# 이유 싸고 좋음

Maker = driver.find_elements(By.XPATH, '//*[@id="dlMaker_simple"]/dd/ul[1]/li')

print(len(Maker))

for i in Maker:
    if 'MSI' in i.text:
        check_MSI = i
    elif 'ASUS' in i.text:
        check_Asus = i
    elif '레노버' in i.text:
        check_renover = i
        
        check_MSI.click()
        check_Asus.click()
        check_renover.click()
    # def manuf_checkList(target_list):
    # manuf = driver.find_elements(By.XPATH, '//*[@id="dlMaker_simple"]/dd/ul[1]/li')
    # for target in target_list
    #   for i in manuf :
    #       if target in manuf : 
    #           m.click()
    #break
    # print(str(target_list), '선택완료')
time.sleep(2)

# 전체 페이지 수를 구한다.
num_models = driver.find_element(By.CLASS_NAME, 'list_num').text.strip().replace('(','').replace(')','').replace(',','')
#print(num_models)
num_pages = math.ceil(int(num_models) / 30)

# xpath를 못 찾아서 이 부분은 주석
# 페이지 변수를 만들어 1씩 더해 전체 페이지 수와 같아지기 까지 반복한다.
#page = 1 
#while page <= num_pages:
#    page += 1
    # 페이지 번호 링크 찾기
#    link = driver.find_element(By.CSS_SELECTOR, f"#productListArea > div.prod_num_nav > div.num_nav_wrap > div. > a:nth-child({page})")
    # 링크 클릭 및 페이지 로딩 대기
#    link.click()
#productListArea > div.prod_num_nav > div

# 스트립트로 확인할 수 있도록 수정 
# movePage()로 전체 page수 만큼 이동하게 콘솔로 확인
page = 1
numofprice_list =[]
soup_dict = {}
while page <= num_pages:
#while page <= 3:
    ## 여기에서 beautifulSoup로 
    soup = BeautifulSoup(driver.page_source)
    products = soup.select('div.prod_main_info')
    time.sleep(2)
    
    soup_dict[page] = products
    
    for i in range(len(products)):
        try: 
           numofprice_list.append(len(products[i].select('div.prod_pricelist li')))
        except:
           numofprice_list.append('')     
    
    time.sleep(2)
    
    print(f"현재 페이지 완료 : {page}")
    
#     # 페이지 이동을 위한 JavaScript 실행
    driver.execute_script(f"movePage({page});")
    
#     # 페이지 확인 대기 시간
    time.sleep(2)
    
#     # 다음 페이지로 증가
    page += 1
    
     # num_pages와 같으면 종료
    if page > num_pages:
         print("마지막 페이지에 도달했습니다.")
         print("가장 많은 가격 정보는", max(numofprice_list), "개 입니다.")
         max_numofprice_list = max(numofprice_list)
         excel_title = '2024.xlxs'
         break
    



# 이제 데이터를 저장해보자
# selenium은 체크페이지,페이지 등등 , 페이지 안에서는 BeautifulSoap로 
# BeautifulSoup로 페이지 파싱

def crawling_danawa_result(soup_dict, max_numofprice_list, excel_title):
    #함수 입력값 : 제품정보 저장된 딕셔, 가격정보 최대, 결과 저장할 엑셀파일명
    
    ### 데이터 저장하 빈 리스트 생성 
    # 모델이름, 출시시기, 레드메시지, 스펙, 리뷰펑점, 갯수, 페이지링크
    name_list, hm_list, spec_list, release_list, star_list, review_list, link_list = [],[],[],[],[],[],[]
    
    # 가격정보 리스트셋 
    price_list_set = []
    priceinfo_list_set =[]
    # 최댓값 만큼 빈 리스트 생성 
    for i in range(max_numofprice_list) :
        priceinfo_list_set.append([])
        price_list_set.append([])
        
    #딕셔너리에 저장한 페이지 하나씩 돌리기
    for key in range(len(soup_dict)) :
        products = soup_dict[key +1]
        
        # 제품마다 하나씩
        for i in range(len(products)):
            
            #모델 시기
            try:
                release =str(products[i].select_one('div.prod_sub_info dd').text.strip())
                release_list.append(release[:-1])
            except:
                continue
            
             #모델 이름
            try:
                name_list.append(str(products[i].select_one('p.prod_name a').text.strip()))
            except:
                name_list.append('')
                
                          #헤드 메세지
            try:
                hm_list.append(str(products[i].select_one('p.prod_intro').text.strip()))
            except:
                hm_list.append('')   
            #모델 스펙    
            try:
                spec_list.append(str(products[i].select_one('p.spec_list').text.strip()))
            except:
                spec_list.append('')                  
             #리뷰갯수    
            try:
                review_list.append(int(products[i].select_one('div.prod_sub_info a').text.strip().replace(',','')))
            except:
                review_list.append(0)             
            # 평점
            try:
                star_list.append(float(products[i].select_one('div.prodcnt-star').text.strip('점','')))
            except:
                star_list.append(0)  
            try:
                thumbnail = products[i].select_one('div.thumb_image a')
                link_list.append(thumbnail['href'])
            except:
                link_list.append('')
                
            pricelist_raw = products[i].select('div.prod_pricelist li')
            
            for p in range(max_numofprice_list):
                try:
                    price_list_set[p].append(str(
                        pricelist_raw[p].select_one('div.over_proview').text.strip()))
                except:
                    price_list_set[p].append('')
            # 최저가        
            for p in range(max_numofprice_list):
                try:
                    price_list_set[p].append(int(
                        pricelist_raw[p].select_one('p.price_sect a').text.strip().replace('원','').replace(',','')))
                except:
                    price_list_set[p].append('')                    
                df_result = pd.DataFrame({
                    '제품모델명' : name_list, '출시시기' : release_list, '리뷰평점' : star_list, '리뷰갯수' : review_list, '헤드메세지 ' : hm_list, '스펙' : spec_list, '링크URL' : link_list
                })    
                 # Create DataFrame
                df_result = pd.DataFrame({
                    '제품모델명': name_list,
                    '출시시기': release_list,
                    '리뷰평점': star_list,
                    '리뷰갯수': review_list,
                    '헤드메세지': hm_list,
                    '스펙': spec_list,
                    '링크URL': link_list
                })       
                    
            with pd.ExcelWriter(excel_title) as writer:
                df_result.to_excel(writer)
                
            return df_result       
        
max_numofprice_list = max(numofprice_list)

excel_title2 = '20241212.xlxsw'        
        
                                    
                                      


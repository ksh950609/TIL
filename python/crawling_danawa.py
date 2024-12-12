#필요한 패키지 가져오기
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.chrome.options import Options
import time 
import openpyxl
import requests
# 크롤링하기 위한 improt
from bs4 import BeautifulSoup
import math
import pandas as pd
import pickle
import crawling_danawa_result as cdr
import crawling_danawa

def crawling_danawa_get_sources(url, target_list, searchWord):
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
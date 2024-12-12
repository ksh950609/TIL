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
                if not excel_title.endswith(".xlsx"):
                  excel_title = excel_title + ".xlsx"
            with pd.ExcelWriter(excel_title) as writer:
                 df_result.to_excel(writer)
                
            return df_result       
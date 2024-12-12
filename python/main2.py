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
url = 'https://www.danawa.com/'
target_list = ['MSI', 'ASUS', '레노버']
searchWord = '게이밍 노트북'
import crawling_danawa

playFunction = crawling_danawa.crawling_danawa_get_sources(url, target_list, searchWord)
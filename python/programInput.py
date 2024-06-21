import sys

args = sys.argv[1:]
for i in args:
    print(i)
    
    # 위는 프로그램 실행 시 전달받은 인수를 for 문을 사용해 차례대로 하나씩 출력하는 예이다. sys 모듈의 argv는 프로그램 실행 시 전달된 인수를 의미한다. 즉, 다음과 같이 입력했다면 
    # argv[0]은 파일 이름 sys1.py가 되고 argv[1]부터는 뒤에 따라오는 인수가 차례대로 argv의 요소가 된다.
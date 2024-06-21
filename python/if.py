money = 2000

if money: 
    print('taxi')
else:
    print('walk')    
    
    # 기본적인 if문이다 
    # 돈이 있으면 taxi 없으면 walk
    # 기본적인 if else의 구조
#     if 조건문:
#     수행할_문장1
#     수행할_문장2
#     ...
# else:
#     수행할_문장A
#     수행할_문장B
#     ...

# 파이썬에서 if문을 만들떄 모든 if에 속하는 모든 문장에 들려쓰기(indentation)를 해야한다.
# if 조건문:
#     수행할_문장1
#     수행할_문장2
#     수행할_문장3

# 콜론도 잊지 말고 해야한다.



money = 2000

if money >= 3000: 
    print('taxi')
else:
    print('walk')    
    
    
# in	not in
# x in 리스트	x not in 리스트
# x in 튜플	x not in 튜플
# x in 문자열	x not in 문자열

# pocket= ['money', 'paper', 'pen' ]

# if 'paper' in pocket :
#     print('taxi')
# else:
#     print('walk')


    # def add_edge(self, u, v):
    #     # 노드 u에서 노드 v로의 간선을 그래프에 추가
    #     if u not in self.graph:
    #         # 노드 u가 그래프에 없으면 새 리스트를 생성
    #         self.graph[u] = []
    #     self.graph[u].append(v)  # 노드 u의 인접 리스트에 노드 v 추가
    
    
    pocket = ['paper','cellphpne']
    card = True
    if 'paper' in pocket:
        print('taxi')
    elif card:
        print('taxi')
    else:
        print('walk')
        
        
        # message = "success" if score >= 60 else "failure"
        # 변수 = 조건문이_참인_경우의_값 if 조건문 else 조건문이_거짓인_경우의_값

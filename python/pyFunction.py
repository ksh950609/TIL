# 함수는 공장
# 원재료를 가지고 와서 그 결과를 빠르게 얻어야한다면 
# 결과값을 만드는 함수를 만들고 어느 곳이든 결과를 빠르게 얻을 수 있게 됨 
# 파이썬에서 함수 는 def로 정의한다 
# ex 
# 곱을 얻고 싶다면 

# def mul(x,y) : 
#     return x*y

# print(mul(1,2))

# def plus(x,y):
#     return x + y
    
# a = 2 
# b = 3 
# c = plus(a,b)
# print(c)

# 리턴값을_받을_변수 = 함수_이름(입력_인수1, 입력_인수2, ...)


# 많은 수를 더하는 방법 
# def manyAdd(*args): 
#     result = 0

#     for i in args:
#         result = result + i
#     return result  

# a = manyAdd(1,2,3,4,5,6,7,8,7)     

# print(a)  

# 위에서 만든 add_many 함수는 입력값이 몇 개이든 상관없다.
# *args처럼 매개변수 이름 앞에 *을 붙이면 입력값을 전부 모아 튜플로 만들어 주기 때문이다.
# 만약 add_many(1, 2, 3)처럼 이 함수를 쓰면 args는 (1, 2, 3)이 되고
# add_many(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)처럼 쓰면 args는 (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)이 된다. 
# 여기에서 *args는 임의로 정한 변수 이름이다. *pey, *python처럼 아무 이름이나 써도 된다

# 선택권이 있는 조건 
# def choose (choice,*args):
#     if choice == 'mul':
#         result = 1
#         for i in args:
#             result = result * i
#     elif choice == 'add':
#         result = 0
#         for i in args:
#             result = result + i 
#     return result   

# print(choose('mul', 1,2,2,3,4,5,1))   
# print(choose('add', 1,2,2,3,4,5,1))             
          
    

# kwargs 키워드

# def keyWord(**kwargs):
#     print (**kwargs)

# 함수 밖에 있는 변수 바꾸기 

# a = 1 
# def vartest(a): 
#     a = a +1 
#     return a

# a = vartest(a) 
# print(a)

# def say_myself(name, age, man=True): 
#     print("나의 이름은 %s 입니다." % name) 
#     print("나이는 %d살입니다." % age) 
#     if man: 
#         print("남자입니다.")
#     else: 
#         print("여자입니다.")

# say_myself("김상훈", 29)
# true
#람다 함수는 단일 표현식으로 제한되기 때문에,
# 복잡한 로직이나 여러 줄로 구성된 코드를 포함하는 함수는 람다 함수로 변환할 수 없습니다. say_myself 함수는 이러한 제약 조건 때문에 람다 함수로 변환할 수 없습니다. 일반 함수로 유지하는 것이 가장 적합합니다.


# lamda 사용하기 

# add = lambda a, b: a+b
# result = add(3, 4)
# print(result)

    
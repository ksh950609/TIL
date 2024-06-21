# while 조건문:
#     수행할_문장1
#     수행할_문장2
#     수행할_문장3
#     ...

# while문의 기본 구조이다

# while 문으로 10번 찍어서 안 넘어지는 나무라는 속담을 풀어보면 

# treehit = 0 

# while treehit < 10 :
#     treehit += 1
#     print('나무를 %d번 베었습니다.'%treehit)
#     if treehit == 10 :
#         print('넘어간다아아아')
        
        
# 커피 자판기 이야기 
# coffee = 300
# cost = 4
# totalCost = 0
# while coffee: 
#     coffee -= 1
#     totalCost += cost
#     print('커피는 %d개 남았고, 오늘 수입은 %s달러 입니다.' %coffee  %totalCost)
# if coffee == 0 :
#     print('완판 축축')        
        
# 더 복잡한 자판기 이야기 
# coffee = 10
# coffeePrice = 3
# totalMoney = 0
# saleCoffee = 0
# returnMoney = 0
# while coffee:
#     cost = int(input("Insert coin please: "))
#     if cost == coffeePrice:
#         saleCoffee += 1
#         coffee -= 1
#         totalMoney += cost
#         print('Take it bro, here is your coffee')
#         print(coffee)
#     elif cost > coffeePrice:
#         saleCoffee += 1
#         coffee -= 1
#         returnMoney += cost - coffeePrice
#         totalMoney += coffeePrice
#         print(coffee)
#         print('Here you are coffee and %s dollar' % (cost - coffeePrice))
#     elif cost < coffeePrice:
#         print('Give me more money')
#     if coffee == 0:
#         print('장사 끝')
#         print('판매한 커피 : %d' % saleCoffee)
#         print('총 판매액 : %d' % totalMoney)
#         print('총 거스름돈 : %d' % returnMoney)

             
             
             
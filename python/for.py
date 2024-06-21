# marks = [50, 60,45, 70, 90]
# number = 0 
# for mark in marks : 
#     number +=1
#     if mark < 60 :
#         continue
#     print("%d번 학생 축하합니다. 합격입니다." %number)
    
    # for 문은 range()와 같이 쓰는 경우가 많다 
# a = range(10)
# a
# range(0, 10)

# add = 0 
# for i in range(0,11):
#     add = add + i
    
#     print(add)

# range(1,11)은 숫자 1부터 10까지 (1이상 11미만)의 숫자를 데이터로 가지는 객체이다.
# 따라서 위 예에서 i변수는 1부터 10까지 하나씩 대입하면 
# add = add + i 무낭을 반복적으로 수행한다.


# marks = [50, 60,45, 70, 90]
# for number in range(len(marks)):
#     if marks[number] < 60:
#         continue
#     print("%d번 학생 축하합니다. 합격입니다." % (number+1))
    
# 구구단    
    # for i in range(2,10):
    #     for j in range(2,10):
    #         print(i*j, end = "")
    #         print('')

# 배열에 3곱하기 
# marks = [50, 60,45, 70, 90]

# result = []
# for num in marks:
#     result.append(num *3)

             
#컴프리헨션을 사용하면 이렇게도 가능 
# result = [num *3 for num in marks]                
# result2 = [num *3 for num in marks if num % 3 == 0 ]   
# result = [num * 3 for num in marks]
# print(result)
# [3, 6, 9, 12]                

result = [ x*y for x in range(1,10)
                for y in range(1,10)]
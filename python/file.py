# f = open("새파일.txt", 'w')
# f.close()

f = open("C:/doit/새파일.txt", 'r')
while True:
    line = f.readline()
    if not line: break
    print(line)
f.close()

while True:
    data = input()
    if not data: break
    print(data)
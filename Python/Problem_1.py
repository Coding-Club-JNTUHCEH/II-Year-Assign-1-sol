import math
n = int(input("Enter the number of food items ordered (n): "))
count = 0
delivery_times = []

print("Enter the delivery times of food items")
for i in range(n):
    el = int(input())
    delivery_times.append(el)
    if el <= 30:
        count += 1

if count >= math.floor(n / 2):
    print("Satisfied")
else:
    print("Frustrated")

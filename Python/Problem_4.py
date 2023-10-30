n = int(input("Enter the number of tickets bought: "))
tickets = []
for i in range(n):
    tickets.append(int(input(f"Enter {i+1} ticket value: ")))

winning_ticket = int(input("Enter value of the winning ticket: "))
won = 0
low = 0
high = n - 1

while low <= high:
    mid = (low + high) // 2  
    if tickets[mid] == winning_ticket:
        won = 1
        print("Won")
        break
    elif tickets[mid] < winning_ticket:
        low = mid + 1
    else:
        high = mid - 1

if won == 0:
    print("Lost")

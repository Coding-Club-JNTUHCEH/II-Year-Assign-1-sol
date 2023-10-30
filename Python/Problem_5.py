def check_height_order(heights):
    for i in range(1, len(heights)):
        if heights[i] <= heights[i - 1]:
            return False
    return True

n = int(input("Enter the number of students: "))
student_heights = []

for i in range(n):
    height = int(input(f"Enter the height of student {i + 1}: "))
    student_heights.append(height)

if check_height_order(student_heights):
    print("Yes")
else:
    print("No")

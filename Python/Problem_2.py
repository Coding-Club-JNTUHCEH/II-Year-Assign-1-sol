def find_second_largest(arr):
    if len(arr) < 2:
        return "There is no second-largest element."

    largest = second_largest = float('-inf')

    for num in arr:
        if num > largest:
            second_largest = largest
            largest = num
        elif num > second_largest and num != largest:
            second_largest = num

    if second_largest == float('-inf'):
        return "There is no second-largest element."
    else:
        return second_largest

shoe_sizes = []
n = int(input("Enter the number of shoe sizes: "))

for i in range(n):
    size = int(input(f"Enter shoe size {i + 1}: "))
    shoe_sizes.append(size)

second_largest_size = find_second_largest(shoe_sizes)
print("Ram's chosen shoe size:", second_largest_size)

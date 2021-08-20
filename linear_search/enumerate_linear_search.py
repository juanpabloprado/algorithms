def linear_search(list, target):
    for index, value in enumerate(list):
        if value == target:
            return index
    return -1

def verify(index):
    if index != -1:
        print('Target found at index: ', index)
    else:
        print('Target not found in list')

numbers = [1,2,3,4,5,6,7,8,9,10]

result = linear_search(numbers, 12)
verify(result)

result = linear_search(numbers, 6)
verify(result)
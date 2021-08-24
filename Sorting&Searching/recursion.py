# It will take the list of numbers to add, just like before.
def sum(numbers):
  # Python treats a list that contains one or more values as a "true" value,
  # and it treats a list containing _no_ values as a "false" value.
  # So we'll add an "if" statement that says if there are no numbers in
  # the list, we should return a sum of 0. That way, the function will exit
  # immediately, without making any further recursive calls to itself.
  if not numbers:
    return 0
  print("Calling sum(%s)" % numbers[1:])
  # Now here's the recursive part. We'll have the "sum" function call itself.
  # We use slice notation to pass the entire list of numbers EXCEPT the
  # first one.
  remaining_sum = sum(numbers[1:])
  print("Call to sum(%s) returning %d + %d" % (numbers, numbers[0], remaining_sum))
  # Then we add the first number in the list to the result of the recursive
  # function call, and return the result.
  return numbers[0] + remaining_sum

print(sum([1, 2, 7, 9]))
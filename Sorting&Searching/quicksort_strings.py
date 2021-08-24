# Again, this code at the top just loads a file full of strings into a list.
import sys
from load import load_strings

names = load_strings(sys.argv[1])

# We'll use our quicksort method to sort the list of names. Its code is
# completely unchanged from when you saw it in the previous stage.
def quicksort(values):
  if len(values) <= 1:
    return values
  less_than_pivot = []
  greater_than_pivot = []
  pivot = values[0]
  for value in values[1:]:
    if value <= pivot:
      less_than_pivot.append(value)
    else:
      greater_than_pivot.append(value)
  return quicksort(less_than_pivot) + [pivot] + quicksort(greater_than_pivot)

# We just call our quicksort function on the list of names loaded from the
# file, and save the list to a variable.
sorted_names = quicksort(names)
# Then, we loop through each name in the sorted list...
for n in sorted_names:
  # ...And print that name.
  print(n)
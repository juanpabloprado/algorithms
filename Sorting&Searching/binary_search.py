# Our code here at the top is unchanged from the previous scripts; we
# just call the load_strings function to load our 100,000 sorted
# names from a file.
import sys
from load import load_strings

names = load_strings(sys.argv[1])

# Here's we've hard-coded the list of 100 names we're going to search
# for again. It's identical to the list from the linear search
# script, except that I've again changed the last two names to
# correspond to the names on the first and last lines of the file
# we'll be loading.
search_names = ["Francina Vigneault", "Lucie Hansman", "Nancie Rubalcaba", "Elida Sleight", "Guy Lashbaugh", "Ginger Schlossman", "Suellen Luaces", "Jamey Kirchgesler", "Amiee Elwer", "Lacresha Peet", "Leonia Goretti", "Carina Bunge", "Renee Brendeland", "Andrew Mcgibney", "Gina Degon", "Deandra Pihl", "Desmond Steindorf", "Magda Growney", "Tawana Srivastava", "Tammi Todman", "Harley Mussell", "Iola Bordenet", "Edwardo Khela", "Myles Deanne", "Elden Dohrman", "Ira Hooghkirk", "Eileen Stigers", "Mariann Melena", "Maryrose Badura", "Ardelia Koffler", "Lacresha Kempker", "Charlyn Singley", "Lekisha Tawney", "Christena Botras", "Mike Blanchet", "Cathryn Hinkson", "Errol Shinkle", "Mavis Bhardwaj", "Sung Filipi", "Keiko Dedeke", "Lorelei Morrical", "Jimmie Lessin", "Adrianne Hercules", "Latrisha Haen", "Denny Friedeck", "Emmett Whitesell", "Sina Sauby", "Melony Engwer", "Alina Reichel", "Rosamond Shawe", "Elinore Benyard", "Sang Bouy", "Ed Aparo", "Sheri Wedding", "Sang Snellgrove", "Shaquana Sones", "Elvia Motamed", "Candice Lucey", "Sibyl Froeschle", "Ray Spratling", "Cody Mandeville", "Donita Cheatham", "Darren Later", "Johnnie Stivanson", "Enola Kohli", "Leann Muccia", "Carey Philps", "Suellen Tohonnie", "Evelynn Delucia", "Luz Kliment", "Lettie Jirjis", "Francene Klebe", "Margart Scholz", "Sarah Growden", "Glennis Gines", "Rachael Ojima", "Teofila Stample", "Narcisa Shanley", "Gene Lesnick", "Malena Applebaum", "Norma Tingey", "Marianela Mcmullen", "Rosalva Dosreis", "Dallas Heinzmann", "Sade Streitnatter", "Lea Pelzel", "Judith Zwahlen", "Hope Vacarro", "Annette Ayudan", "Irvin Cyree", "Scottie Levenstein", "Agustina Kobel", "Kira Moala", "Fawn Englar", "Jamal Gillians", "Karen Lauterborn", "Kit Karratti", "Steven Deras", "Aaron Agustine", "Zulma Tishler"]

# Now let's write the function that will implement our binary search
# algorithm.  Like the linear search function before, it will take
# two arguments. The first is the list we're going to search through,
# and the second is the target value we're searching for. Again, the
# binary_search function will return the index it found the value at,
# or the special value None if it wasn't found.
def binary_search(collection, target):
  # Binary Search is faster than linear search because it discards
  # half the values it has to search through each time. To do this,
  # it needs to keep track of a range that it still needs to search
  # through. To start, that range is going to include the full list.
  # The "first" variable will track the lowest index in the range
  # we're searching. To start, it's going to be 0, the first index in
  # the full list.
  first = 0
  # Likewise, the "last" variable will track the highest index in the
  # range we're searching. To start, we'll set it to the highest
  # index in the full list.
  last = len(collection) - 1
  # If the "first" and "last" variables are equal, then it means the
  # size of the search range has shrunk to zero and there is no
  # match. Until that happens, though, we'll keep looping to continue
  # the search.
  while first <= last:
    # We want to divide the list of potential matches in half each
    # time.  To do that, we need to check the value that's in the
    # middle of the range we're searching in. We add the indexes in
    # the "first" and "last" variables, then divide by two to get
    # their average. We might get a fractional number, which can't be
    # used as a list index, so we also round down using Python's //
    # floor division operator. All this will give us the index of the
    # list element that's the midpoint of the range we're
    # searching. We store that in the "midpoint" variable.
    midpoint = (first + last) // 2
    # We test whether the list element at the midpoint matches the
    # target value.
    if collection[midpoint] == target:
      # If it does, we return the midpoint index without looping any
      # further.  Our search is complete!
      return midpoint
    # Otherwise if the midpoint element's value is less than the
    # target value...
    elif collection[midpoint] < target:
      # We know that our target value can't be at the midpoint or any
      # index prior to that. So we move the new start of our search
      # range to just after the old midpoint.
      first = midpoint + 1
    # Otherwise, the midpoint element's value must have been greater
    # than the target value...
    else:
      # We know that our target value can't be at the midpoint or any
      # index AFTER that. So we move the new end of our search range
      # to just BEFORE the old midpoint.
      last = midpoint - 1
  # By unindenting here, we mark the end of the loop. If the loop
  # completes, it means the search range shrank to nothing without
  # our finding a match, and that means there's no matching value in
  # the list. So we return the special Python value None to indicate
  # this.
  return None

# Lastly, just as we did in our Linear Search script, we need to
# search for each of the 100 names. We loop over each name in our
# hard-coded list...
for n in search_names:
  # ...And we call the binary_search function with the sorted list of
  # names we're going to load from the file, and the current name
  # we're searching for. We store the returned list index in the
  # "index" variable...
  index = binary_search(names, n)
  # ...And then we print that variable.
  print(index)
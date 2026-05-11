Gnome sort:
Convert this pseudocode to java. Keep the variable names exactly they are. The array parameter is called a, the position variable
is called pos. Method works with generic Comparable objects and there
is a swap() method already available. 
procedure gnomeSort(a[]):
pos := 0
while pos < length(a):
if (pos == 0 or a[pos] >= a[pos-1]):
pos := pos + 1
else:
swap a[pos] and a[pos-1]
pos := pos - 1"

Claude: A working implementation. Used pos and a correctly. Used compareTo()
for the comparison and called swap() where the pseudocode swaps.

Cocktail shaker sort:
Convert this pseudocode to Java. Variable names must stay exactly
as shown: a, swapped, i. Generic Comparable objects, swap() is available.
procedure cocktailShakerSort(a):
do
swapped := false
for each i in 0 to length(a)-1:
if a[i] > a[i+1] then swap, swapped = true
if not swapped then break
swapped := false
for each i in length(a)-1 to 0:
if a[i] > a[i+1] then swap, swapped = true
while swapped
Claude:
Correct implementation. Forward and backward passes both looked right.
Variable names matched.

I ensured to check it and everything matched the pseudo. made no changes with that part.

Write JUnit 5 tests for gnomeSort and cocktailShakerSort.
Cover: empty array, single element, already sorted, reverse sorted,
duplicates, all same elements, two elements swapped, two elements
already in order, random order, and a String array

claude:20 tests covering all the required categories for both methods,
with both Integer and String arrays.

I added isSorted() helper method to avoid having to rewrite the same loop in every test
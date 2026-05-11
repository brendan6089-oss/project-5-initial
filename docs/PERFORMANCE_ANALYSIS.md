10,000 random integers, range 0-50000. Run using SortingDriver.
Gnome Sort: 97.97  ms
Cocktail shaker sort: 148.11 ms
Shell sort: 3.80 ms.

shell sort was not close at all. almost 100 ms less than gnome and much futher ahead of the cocktail. Cocktail shaker was the slowest of the three even though it goes both directions. 
On fully random data the extra backward pass adds overhead. Gnome and cocktail shaker are both 0(n^2) which explains it. 

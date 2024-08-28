README

Code by Josie Barber and El Anderson

Questions:
1.
The number of lines output by the code is n factorial (n!)
    for the first line in the string there is n options and 
    the second has n-1 options and 
    third has n-2 options and so forth
    so for n = 3 it could be this pattern would be represented as 3 * 2 * 1 or 3!

2. 
Josie's code has a big O of approx 0.08 * O(n!)
We found that it was approx O(n!) by dividing our average runtime for each given n by n! 
this showed us that it was indeed approx O(n!) because the output graph was fairly level.

El's code has a runtime of approiximatly 0.0017*O(n!). 
This was found in the same way that Josie's runtime was derrived. Here is a link to the math we did when calculating runtimes and our constants : https://docs.google.com/spreadsheets/d/16VdmDaRfDrzz2ps4Kza7p3GPDtJJmtsusJOy6fWeXSg/edit?usp=sharing
For n = 15 the time it would take to run would be ~2223046425.6 milliseconds
for n = 20 it would be ~ 4.1359334e+1 milliseconds

// Both constants were found using El's laptop and the runtime differences are from running the code on Intelij vs VS code.

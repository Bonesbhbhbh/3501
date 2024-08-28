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
    a.
        Josie's code has a big O of approx O(n!)
        We found that it was approx O(n!) by dividing our average runtime for each given n by n! 
        this showed us that it was indeed approx O(n!) because the output graph was fairly level.
        
        There was an approximate constant of 0.08 after dividing by n! therefore 
        to find how long n = 15 would run, we do:
        0.08 * 15! = 104613949440

        to find how long n = 20 would run, we do:
        0.08 * 20! = 1.9463216e+17


        


# Find the seed of a random number to predict the next number

## Context
PRNG is Pseudo Random Number Generator, is refers to an algorithm that uses mathematical formulas to produce sequences of random numbers
This method to generate a random number are now deprecated, because the PRNG algorithm is now know

## Mathematical problem
How PRNG are generated ?
PRNG use this mathematical problem to be generated this mathematical problem is call  :
[Linear Congruential Generator (LCG)](https://en.wikipedia.org/wiki/Linear_congruential_generator)
![alt text](https://zupimages.net/up/22/19/1cwr.png)
Where : 
- Xn = seed
- a = multiplier
- c = increment
- m = modulus

## Different problems depending on the language

| Language | Multiplier ( a ) | Increment ( c ) | Modulus ( m )
| ------ | ------ | ------ | ------ |
| C# | 1664525    | 1013904223   | 2^32 |
| Java | 25214903917 | 11 | 2^48 |
| Pascal | 134775813  | 1 | 2^32 |
| VB .NET | 1140671485   | 12820163  | 2^24 |
| C | 214013    | 2531011   | 2^32 |
| C++ | 214013    | 2531011   | 2^32 |

## What is .java file ?

The java file is use to generate a random number using a random() class of java.
This class isn't cryptographically secure because it was PRNG.

## What is .py file ?

The python script file uses the mathematical problem LCG in order to find the seed of the PRNG and thus predict the next numbers which will be generated "randomly"


## Conclusion
For more security use CSPRNG (Cryptographically Secure Pseudo Random Generator) to be protected.
> Note : Mainly in programming languages, the safe class (CSPRNG) is srand() or srandom()


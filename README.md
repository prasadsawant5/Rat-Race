Problem Statement

N rats are put in a rate race. Distance of different rats from the finishing line may be different. Two different rats' speed may be different from each other. Each rat's speed doesn't change.

Given distance and speed of each rat, tell us which of the rats win the race.

Input Format

The first line of input contains N, the number of participating rats.
The next line contains N space-separated integers where the ith integer denotes the speed of the ith rat.
The next line contains N space-separated integers where the ith integer denotes the distance of the ith rat from the finishing line.

Contraints

1≤N≤100
1≤ Speed, Distance ≤100

Note

Time taken by a rat to complete race can be in fractions.

Output Format
Print the number of each rat that will win the race in a separate line. The number of the rats is determined by their order in input (1 being the number of the 1st rat in input, 2 being the number of the 2nd rat, and so on).

Sample Input

3
2 5 1
4 10 3

Sample Output

1
2

Explanation

Rat 1 and 2 will take 2 units of time to finish. Rat 3 will take 3 units of time. So, 1 and 2 are the winners

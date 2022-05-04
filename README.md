# K-Map-solver-using-java


///////////k map///////////
In many digital circuits and practical problems we need to find expression with minimum variables. 
We can minimize Boolean expressions of 3, 4 variables very easily using K-map without using any Boolean algebra theorems. 
K-map can take two forms Sum of Product (SOP) and Product of Sum (POS) according to the need of problem.
K-map is table like representation but it gives more information than TRUTH TABLE. We fill grid of K-map with 0’s and 1’s then solve it by making groups.


Steps to solve expression using K-map- 

->Select K-map according to the number of variables.
->Identify minterms or maxterms as given in problem.
->For SOP put 1’s in blocks of K-map respective to the minterms (0’s elsewhere).
->For POS put 0’s in blocks of K-map respective to the maxterms(1’s elsewhere).
->Make rectangular groups containing total terms in power of two like 2,4,8 ..(except 1) and try to cover as many elements as you can in one group.
->From the groups made in step 5 find the product terms and sum them up for SOP form.


![image](https://user-images.githubusercontent.com/104202659/166725867-1a3672f5-3eb9-474c-9f89-2124b0b1a981.png)


![image](https://user-images.githubusercontent.com/104202659/166725897-13dd26c1-5be2-49ab-9c22-16800ce89cb5.png)


![image](https://user-images.githubusercontent.com/104202659/166725926-b5bd7395-b307-460c-a7ac-aa95f19c1d36.png)


![image](https://user-images.githubusercontent.com/104202659/166726855-f1e6f1e5-5293-45eb-945d-1f08dab1bcac.png)      ![image](https://user-images.githubusercontent.com/104202659/166726979-2625689b-1e2f-4fe4-93cc-98fcaa89720f.png)

![image](https://user-images.githubusercontent.com/104202659/166727126-c3f9c242-c49b-47a0-bec8-21792b0d6dc9.png)      ![image](https://user-images.githubusercontent.com/104202659/166727280-9c2a4513-785f-4773-88f6-fdc2ff1f2588.png)

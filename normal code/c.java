1.Data types
2.operater
3.control structure
4.pointer
5.array
6.function
7.storage class
8.preprocessor
9.structure and union
10.file
11.command line



memory
--------
It is 3 types
1.logical memory
2.vertual memory
3.physical memory(ram)
->The hard disk is devided into different partition
->partition is divided into different block
->block is divided into different sector
	1 sector is 5,12 bytes
	1 block is 8 sector
	1 partition, 1 block, 1 sector is a boot sector hard disk is a storage device not a memory
windows file system
-------------------
->NTFS
->FAT32
->EXFAT
linux file system
-------------------
->ext 2
->ext 3
->ext 4
->A location unit size means the partition block size
->Formatting means changeing the file system in the disk drive
->file system is a driver which arrange files and directory in the disk
Data Type 
---------------
Important question for data types
1.what is the different between nul and null
2.why negetive data present in memory in 2s compliment?
3.what is endianess?
4.which modifiers doubles the range of data types?
5.what are the data type are missing c programming language
6.which programming language does not support data types
7.which is the use of volatile
8.what is different between data types and modifiers
9.Incrimenting float variable biond its maximum range what will be the output
10.what is the difference between modifiers and qualifiers
11.write a programme to calculate the factorial of  a number?

	Data type 						modifiers					qualifiers
	-----------					-----------------			------------------
	Character						Signed						Const
	Integer							unsigned					volatile
	Float 							short
	Double 							long
	Void
	Enum
	Structure 
	Union 

-> All scripting language are does not support data type 

									Operater 
								===================
->C language totaly support 45 number of operater
Question   :- 
1.what is the difference between precidency and associativity.							
2. Which operater in C can not over loaded on C++
3. Without sizeof operater how to measure the size of a variable
4. Write One line Statement to interchange between two variable with out using relational operater
5. How to display the smallest between any three Integer
6. With out using any relational operator how to display all the number from 1 to 10 useing loop 
7. What are the different types of operater in C.
8. Write one line statement to calculate generic root of a number.
9. Write a programme to add between any two number with out using any arithmatic operator
10. Write a program to check a number is od or even with out using any condition

	Precidency 								Associativity 
------------------------------------------------------------------
->It is decide which operator			->It is decided the order of evaluation 
will be perform first in an 			 if more than one operand engage in
expression								 same precidence

	
	Precidence 				Operator 					Associativity
------------------		-------------------			-------------------------
								() 						
		1st						[]						left to right
								.
								->

								++
		2nd						--
								! (not)
								_ (1s Compliment)
								& (address) 			right to left
								' " ' (Indirection)
								sizeof()
								(type)

								*
		3rd						/						left to right
								%

								+
		4th						-						left to right

								>>(right shift)
		5th						<<(left shift) 			left to right


								>=
		6th						<=						left to right
								>
								<


								==
		7th						!=


		8th(bit wise) 			& (and) 				left to right

		9th 					^ (xor) 				left to right

		10th 					| (or) 					left to right

		11th(logical)			|| (or) 				left to right

		12th 					&& (and) 				left to right

		13th 					?: (conditional)  		right to left


								+=
								-=
								/=
								*=
								%=
		14th					>>=	 (comapund			right to left
								<<=	  assignment)
								&=
								^=
								|=
								= (assignment)

		15th 					" ' " (comma) 			left to right


								#(string)		(these two operater are using
								##(merging) 	 preprocessor and directives)

Relational Operator
---------------------
	>	|
	<	|	6th highest precidence
	>=	|
	<=	|

	!= 	|	7th highest precidence
	==	|

	!  -  2nd highest precidence
All the relational operator return value is 1,0

Program 
-----------
#include "stdio.h"
main()
{
	int a=5, b=5, c=5;
	if(a==b==c)
		printf("hi hi");
	else
		printf("bye bye");
}

#include "stdio.h"
main()
{
	int a=5, b=7, c=3;
	if(a>b && a>c)
		printf("a is largest");
	else
	if(b>c)
		printf("b is largest");
	else 
		printf("c is largest");
}

#include "stdio.h"
main()
{
	int a,b,c;
	printf("enter any three number");
	scanf("%d %d %d",&a,&b,&c);
	if(a>b && a>c)
		printf("%d is ls largest",a);
	else
	if(b>c)
		printf("%d is largest",b);
	else
		printf("%d is largest",c);
}

#include "stdio.h"
main()
{
	int k=90;
	if(!90>10)
		printf("hi");
	else
		printf("bye");
}

#include "stdio.h"
main()
{
	int k=!!90;
	printf("%d",k);
}

#include "stdio.h"
main()
{
	int i=1;
	while(i<=10)
	{
		printf("%d",i);
		i=i+10;
	}
}

#include "stdio.h"
main()
{
	int a=10, b=5, c=4;
	int counter=0;
	while(a && b && c);
	{
		a--;
		b--;
		c--;
		counter++;
	}
	printf("%d",counter);
}

#include "stdio.h"
main()
{
	int i=100;
	while(i>=1)
	{
		printf("%d",i);
		i=i-1;
	}
}

Display all the number from 1 to 10 without useing relational operator

#include "stdio.h"
main()
{
	int i=1;
	while(1-11)
	{
		printf("%d",i);
		i=i+1;
	}
}
-> Any non zero value represents true

Logical Operator
-------------------------
	|| (or) 11th highest precidence
	&& (and) 12th highest precidence

All the logical operator return value is 1,0
or - any one of the true is true
and - any one is false is false

-> Logical operator are implemented in char, float, double, int type
program
--------------
#include "stdio.h"
main()
{
	int k=20/10;
	printf("%d",k);
}

#include "stdio.h"
main()
{
	int i=5;
	int k=30 || --i;
	printf("%d",k);
}

#include "stdio.h"
main()
{
	int k, a=5, b=9, c=10;
	k=--a || ++b && --c;
	printf("%d %d %d %d",k,a,b,c);
}

#include "stdio.h"
main()
{
	int k, a=1, b=9, c=10;
	k=--a || ++b && --c;
	printf("%d %d %d %d",k,a,b,c);
}
#include "stdio.h"
main()
{
	int k, a=1, b=9, c=10;
	k= --a && ++b || --c;
	printf("%d %d %d %d",k,a,b,c);
}

	Bitwise Operator
	--------------------
	8th		& 	and
	9th 	^ 	xor
	10th	| 	or
	5th 	>>	right shift
			<< 	left shift
	2nd		~ 	1s compliment























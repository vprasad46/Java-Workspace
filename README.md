# Java-Workspace


1.Least Recently Used
		It is a program to implement Least Recently Used (LRU) concept. Given a key, if it is already existed then it should be marked as recently used otherwise a value should be stored which is given as input and marked as recently used. The capacity is to store only 10 key, value pairs. If the table is full and given a new key; the key, value pair which is not recently used should be deleted which gives feasibility to store the new key, value pair.
2.Taxi Reservation System
		 Design a Call taxi booking application
		-There are n number of taxi’s. For simplicity, assume 4. But it should work for any number of taxi’s.
		-The are 6 points(A,B,C,D,E,F)
		-All the points are in a straight line, and each point is 15kms away from the adjacent points.
		-It takes 60 mins to travel from one point to another
		-Each taxi charges Rs.100 minimum for the first 5 kilometers and Rs.10 for the subsequent kilometers.
		-For simplicity, time can be entered as absolute time. Eg: 9hrs, 15hrs etc.
		-All taxi’s are initially stationed at A.
		-When a customer books a Taxi, a free taxi at that point is allocated
		-If no free taxi is available at that point, a free taxi at the nearest point is allocated.
		-If two taxi’s are free at the same point, one with lower earning is allocated
		-Note that the taxi only charges the customer from the pickup point to the drop point. Not the distance it travels from an adjacent point to pickup the customer.
		-If no taxi is free at that time, booking is rejected

		Design modules for

		1)    Call taxi booking 
		Input 1:
		Customer ID: 1
		Pickup Point: A
		Drop Point: B
		Pickup Time: 9

		Output 1:
		Taxi can be allotted.
		Taxi-1 is allotted

		Input 2:
		Customer ID: 2
		Pickup Point: B
		Drop Point: D
		Pickup Time: 9

		Output 1:
		Taxi can be allotted.
		Taxi-2 is allotted 
		(Note: Since Taxi-1 would have completed its journey when second booking is done, so Taxi-2 from nearest point A which is free is allocated)


		Input 3:
		Customer ID: 3
		Pickup Point: B
		Drop Point: C
		Pickup Time: 12

		Output 1:
		Taxi can be allotted.
		Taxi-1 is allotted 
		2) Display the Taxi details


3.String Excercise 1
		Write a program to form lines using given set of words. The line formation should follow below rules.

		i) Total characters in a single line excluding the space between the words and the favorite character should not exceed the given number.

		ii) Favorite character is case insensitive.

		iii) Words should not be broken up. Complete words alone should be used in a single line. A word should be used in one line only.

		Input : Max char per line = 10
			Favorite character = 'o'
			Words : Moho, Eating, Watching, Pogo
				Loving, Mango
		Output : Watching Moho
			 Eating Mango
			 Loving Pogo.

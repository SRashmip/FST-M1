user1 = input("What is player 1 name:")
user2 = input("What is player2 name:")
user1_answer = input(user1+ "Do you want to choose rock,paper or scissor" )
user2_answer = input(user2+"Do you want to choose rock,paper or scissor")

if user1_answer==user2_answer:
    print("its tie")
elif user1_answer=='rock':
    if user2_answer=='paper':
        print("rock wins")
    else:
        print("paper wins")

elif user1_answer=='scissor':
    if user2_answer=='paper':
        print("scissor wins")
    else:
        print("paper wins")
elif user1_answer=='paper':
     if user2_answer=='rock':
         print("paper wins")
     else:
         print("scissor wins")
else:
    print("wrong input! you have not entered rock,paper,scissor try again!")

       
    

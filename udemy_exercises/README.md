**UDEMY Exercises**

Complete the following challenges that's part of Section 8 of the Java Masterclass Udemy course : 

For your convenience, the exercises from UDEMY are summarized below:

1. **Banking w/ Java Classes**
   - **Bank class**
     - List of Branches
     - Add a new branch
     - Add a customer to that branch with initial transaction
     - Add a transaction for an existing customer for that branch
     - Show a list of customers for a particular branch and optionally a list of their transactions
   - **Branch class**
     - List of Customers
     - List of Transactions
     - addCustomer and initial transaction amount
     - Also needs to add additional transactions for that customer/branch
   - **Customer Class**:
     - Customer Name
  
2.  **Song Player w/ Java Classes**
     - **Song class** 
       - Title
       - Duration
     - **Album class** 
       - Playlist of **Songs**.
       - addPlayist() (songs must appear in the list in the order by which they were added)
       - stop()
       - nextSong()
       - previousSong()
       - repeatSong()
       - showPlaylist()
       - removePlaylist()
     - **A song must exist in an album before it can be added to the playlist (so you can only play songs that you own.)**

3. **Cell Phone with Java Classes**
    - **CellPhone Class:**
        - Contact List
        - quit()
        - showContacts()
        - addContact()
        - updateContat()
        - removeContact()
        - searchContact()
      * **When adding or updating be sure to check if the contact already exists**
      * **Be sure not to expose the inner workings of the Arraylist to MobilePhone (use concepts of encapsulation to meet this requirement)**
  
    - **Contact Class:**
        - Name
        - Phone number
        - saveContact()
        - modifyContact()
        - searchContact()
        - removeContact()
  
  
4. **Sorting** 
    - **sortIntegers()**
        -  Create a Java function that sorts a list of integers in descending order
        -  getIntegers() - returns an array of entered integers from keyboard
        -  printArray() - prints out the contents of the array
        -  sortIntegers() - sort the array and return a new array containing the sorted numbers
    - **reverseArray()**
        - Write a method called reverse() that takes an integer array, and reverses it.  This method should not return the array.  It only modifies the array passed into it.  ***Do you think this function is pure or impure?***
        - The method should not return any value. In other words, the method is allowed to modify the array parameter.
        - In main() test the reverse() method and print the array both reversed and non- reversed.
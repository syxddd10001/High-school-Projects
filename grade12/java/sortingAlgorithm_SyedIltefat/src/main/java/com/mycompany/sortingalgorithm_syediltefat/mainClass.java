/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.mycompany.sortingalgorithm_syediltefat;

/**
*Name: Syed Iltefat
*Date: 2020-11-01
*Purpose: Sorting Algorithm
*Title: Assignment 8
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;


public class mainClass {

    //varaibles
    static int numbers[]; // integer array for storing numbers
    static int comparisons; 
    static String array[]; // string array to convert the number array values to string for output as labels
    static JLabel lblText = new JLabel("Arrays are sorted in ascending order by default"); // labels
    static JLabel lblText1 = new JLabel(""); // labels
    static JLabel lblText2 = new JLabel("");
    static JLabel lblText3 = new JLabel("");
    static JLabel lblText4 = new JLabel("Enter the value you're looking for ");
    static JLabel lblText5 = new JLabel("Location values are based on sorted ascending order");
    static JLabel lblText6 = new JLabel("");
    
    static JLabel lblText7 = new JLabel(" ");
    static JLabel lblText8 = new JLabel(" ");
    static JLabel lblText9 = new JLabel(" ");
    
    static JLabel lblDisplay = new JLabel("-");

    static JButton btn1 = new JButton("SORT"); // sort button
    static JButton btn2 = new JButton("SEARCH"); // search button
    static JFormattedTextField txtInput = new JFormattedTextField(); // text input field for array size
    static String data = txtInput.getText(); //converting input to string
    static JFormattedTextField txtInput2 = new JFormattedTextField();//text input field to search the value
    static String data2 = txtInput.getText();//converting input to string
    static JRadioButton insertion = new JRadioButton("Insertion Sort",false); //radio buttons
    static JRadioButton quick = new JRadioButton("Quick Sort",false);
    static JRadioButton merge = new JRadioButton("Merge Sort",false);
    static JRadioButton selection = new JRadioButton("Selection Sort",false);
    static JRadioButton shell = new JRadioButton("Shell Sort",false);
    static JRadioButton heap = new JRadioButton("Heap Sort",false);

    static JRadioButton ascending = new JRadioButton("Ascending", true);
    static JRadioButton descending = new JRadioButton("Descending", false);



    static JScrollPane listScroll = new JScrollPane(); //scroll lists
    static JScrollPane listScroll2 = new JScrollPane();
    static DefaultListModel listModel = new DefaultListModel();
    static DefaultListModel listModel2 = new DefaultListModel();
    static JList NumList = new JList(listModel);
    static JList NumList2 = new JList(listModel2);
    static JFrame frame = new JFrame("SORTING LAYOUT");         

    static JPanel NORTHPanel = new JPanel(); //panels
    static JPanel WESTPanel = new JPanel();
    static JPanel EASTPanel = new JPanel();



    //methods

    private static void GUILayout() // main GUI layout
    {

            frame = new JFrame("Flow Layout");         
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

            NORTHPanel = new JPanel(); 
            WESTPanel = new JPanel();
            EASTPanel = new JPanel();
            //set Layout managers 
            NORTHPanel.setLayout(new GridLayout(0,2)); 
            WESTPanel.setLayout(new BoxLayout(WESTPanel, BoxLayout.PAGE_AXIS)); 
            EASTPanel.setLayout(new BoxLayout(EASTPanel, BoxLayout.PAGE_AXIS));

            lblText1 = new JLabel("Array size: ");
            lblText2 = new JLabel("Unsorted: ");
            lblText3 = new JLabel("Sorted: ");
            //text inputs and parsing
            lblDisplay = new JLabel(" ");
            ButtonHandler onClick = new ButtonHandler();  
            ButtonHandler onClick1 = new ButtonHandler();
            //attach an event listener to the button    
            btn1.addActionListener(onClick); 		
            btn2.addActionListener(onClick1); 	

            lblText6 = new JLabel("Comparisons: " + Integer.toString(comparisons));


            NumList = new JList(listModel);

            listScroll = new JScrollPane(NumList);
            listScroll2 = new JScrollPane(NumList2);
            //buttons and labels
            //add components to bottomPanel
            NORTHPanel.add(lblText1); // north[top] side of the panel
            EASTPanel.add(lblText);
            // west[left] side of the panel
            WESTPanel.add(txtInput);	 
            WESTPanel.add(insertion); 
            WESTPanel.add(quick);
            WESTPanel.add(merge);
            WESTPanel.add(selection);
            WESTPanel.add(shell);
            WESTPanel.add(heap);
            EASTPanel.add(ascending);
            EASTPanel.add(descending);
            WESTPanel.add(btn1);
            WESTPanel.add(lblText2);
            WESTPanel.add(listScroll);
            WESTPanel.add(lblText3);
            WESTPanel.add(listScroll2);
            WESTPanel.add(lblText6);
            // east[right] side of the panel
            
            EASTPanel.add(lblText4);
            
            EASTPanel.add(txtInput2);
            
            EASTPanel.add(btn2); 
            EASTPanel.add(lblText5);
            EASTPanel.add(lblDisplay);
            txtInput.selectAll();
            Container contentPane = frame.getContentPane();//add each panel 
            contentPane.add(NORTHPanel,BorderLayout.NORTH); 
            contentPane.add(WESTPanel, BorderLayout.WEST);
            contentPane.add(EASTPanel, BorderLayout.EAST);
            frame.setSize(650,500);
            frame.setVisible(true);
            comparisons = 0;
    }
    public static void main(String[] args) // run GUI
    {
          javax.swing.SwingUtilities.invokeLater(new Runnable()
            {
                    public void run() 
                    {
                        GUILayout();
                    }
            });


    } 

    private static class ButtonHandler implements ActionListener 
    { // handles all button presses

        public void actionPerformed(ActionEvent e)
        {
            String data = txtInput.getText(); // converting size of the text input to string 

            String data2 = txtInput2.getText();
            

            if (insertion.isSelected()) // radio button is selected
            { 
                    int num = Integer.parseInt(data); // parsing input to int
                    listModel.removeAllElements(); //removing all elements from the list
                    listModel2.removeAllElements();
                    randNumGen(num); // generating random numbers to arrays
                    numToString(num); // converting numbers array  to string array
                    NumList = new JList(array); //creating a list
                    listModel = new DefaultListModel();
                    for (int i = 0; i< num;i ++) // adding elements to the list
                    {
                            listModel.addElement(array[i]);
                    }
                    NumList = new JList(listModel);
                    listScroll = new JScrollPane(NumList); // adding list to the scroll
                    insertion(numbers); // sorting numbers
                    numToString(num); // changing the sorted numbers to string for output
                    if(descending.isSelected()) // show array in descending order
                    {
                            for (int i = num-1; i >= 0;i --)
                            {
                                    listModel2.addElement(array[i]);
                            }

                    }
                    else //show in ascending 
                    {
                            for (int i = 0; i < num;i ++)
                            {
                                    listModel2.addElement(array[i]);
                            }

                    }

                    NumList2 = new JList(listModel2);
                    listScroll2 = new JScrollPane(NumList2);

                    insertion.setSelected(false); //deselect current radio button
                    frame.dispose(); // getting rid of the prev frame
                    GUILayout(); // refreshing the frame to show the current array
                // basically updating the frame when the user hits a button and a radio button
            } 

            else if (quick.isSelected()) // radio button is selected
            {
                    int num = Integer.parseInt(data); // parsing input to int
                    listModel.removeAllElements(); //removing all elements from the list
                    listModel2.removeAllElements();
                    randNumGen(num); // generating random numbers to arrays
                    numToString(num); // converting numbers array  to string array
                    NumList = new JList(array); //creating a list
                    listModel = new DefaultListModel();
                    for (int i = 0; i< num;i ++) // adding elements to the list
                    {
                            listModel.addElement(array[i]);
                    }
                    NumList = new JList(listModel);
                    listScroll = new JScrollPane(NumList);
                    QuickSort(numbers, 0, num-1);
                    numToString(num);
                    if(descending.isSelected()) // radio button is selected 
                    {
                            for (int i = num-1; i >= 0;i --)
                            {
                                    listModel2.addElement(array[i]);
                            }

                    }
                    else 
                    {
                            for (int i = 0; i < num;i ++)
                            {
                                    listModel2.addElement(array[i]);
                            }

                    }

                    NumList2 = new JList(listModel2);
                    listScroll2 = new JScrollPane(NumList2);
                    quick.setSelected(false);
                    frame.dispose(); // getting rid of the prev frame
                    GUILayout(); // refreshing the frame to show the current array


            }


            else if (merge.isSelected()) // radio button is selected
            {

                    int num = Integer.parseInt(data); // parsing input to int
                    listModel.removeAllElements(); //removing all elements from the list
                    listModel2.removeAllElements();
                    randNumGen(num); // generating random numbers to arrays
                    numToString(num); // converting numbers array  to string array
                    NumList = new JList(array); //creating a list
                    listModel = new DefaultListModel();
                    for (int i = 0; i< num;i ++) // adding elements to the list
                    {
                            listModel.addElement(array[i]);
                    }
                    NumList = new JList(listModel);
                    listScroll = new JScrollPane(NumList);

                    MergeSort(numbers, 0,num-1);
                    numToString(num);
                    if(descending.isSelected()) 
                    {
                            for (int i = num-1; i >= 0;i --)
                            {
                                    listModel2.addElement(array[i]);
                            }

                    }
                    else 
                    {
                            for (int i = 0; i < num;i ++)
                            {
                                    listModel2.addElement(array[i]);
                            }

                    }

                    NumList2 = new JList(listModel2);
                    listScroll2 = new JScrollPane(NumList2);
                    merge.setSelected(false);
                    frame.dispose(); // getting rid of the prev frame
                    GUILayout(); // refreshing the frame to show the current array

            }

            else if (selection.isSelected()) // radio button is selected
            {
                    int num = Integer.parseInt(data); // parsing input to int
                    listModel.removeAllElements(); //removing all elements from the list
                    listModel2.removeAllElements();
                    randNumGen(num); // generating random numbers to arrays
                    numToString(num); // converting numbers array  to string array
                    NumList = new JList(array); //creating a list
                    listModel = new DefaultListModel();
                    for (int i = 0; i< num;i ++) // adding elements to the list
                    {
                            listModel.addElement(array[i]);
                    }
                    NumList = new JList(listModel);
                    listScroll = new JScrollPane(NumList);
                    SelectionSort(numbers);
                    numToString(num);
                    if(descending.isSelected()) 
                    {
                            for (int i = num-1; i >= 0;i --)
                            {
                                    listModel2.addElement(array[i]);
                            }

                    }
                    else 
                    {
                            for (int i = 0; i < num;i ++)
                            {
                                    listModel2.addElement(array[i]);
                            }

                    }

                    NumList2 = new JList(listModel2);
                    listScroll2 = new JScrollPane(NumList2);
                    selection.setSelected(false);
                    frame.dispose(); // getting rid of the prev frame
                    GUILayout(); // refreshing the frame to show the current array

            }

            else if (shell.isSelected()) // radio button is selected
            {
                    int num = Integer.parseInt(data); // parsing input to int
                    listModel.removeAllElements(); //removing all elements from the list
                    listModel2.removeAllElements();
                    randNumGen(num); // generating random numbers to arrays
                    numToString(num); // converting numbers array  to string array
                    NumList = new JList(array); //creating a list
                    listModel = new DefaultListModel();
                    for (int i = 0; i< num;i ++) // adding elements to the list
                    {
                            listModel.addElement(array[i]);
                    }
                    NumList = new JList(listModel);
                    listScroll = new JScrollPane(NumList);
                    ShellSort(numbers);
                    numToString(num);
                    if(descending.isSelected()) 
                    {
                            for (int i = num-1; i >= 0;i --)
                            {
                                    listModel2.addElement(array[i]);
                            }

                    }
                    else 
                    {
                            for (int i = 0; i < num;i ++)
                            {
                                    listModel2.addElement(array[i]);
                            }

                    }

                    NumList2 = new JList(listModel2);
                    listScroll2 = new JScrollPane(NumList2);
                    shell.setSelected(false);
                    frame.dispose(); // getting rid of the prev frame
                    GUILayout(); // refreshing the frame to show the current array

            }

            else if (shell.isSelected()) // radio button is selected
            {
                    int num = Integer.parseInt(data); // parsing input to int
                    listModel.removeAllElements(); //removing all elements from the list
                    listModel2.removeAllElements();
                    randNumGen(num); // generating random numbers to arrays
                    numToString(num); // converting numbers array  to string array
                    NumList = new JList(array); //creating a list
                    listModel = new DefaultListModel();
                    for (int i = 0; i< num;i ++) // adding elements to the list
                    {
                            listModel.addElement(array[i]);
                    }
                    NumList = new JList(listModel);
                    listScroll = new JScrollPane(NumList);
                    ShellSort(numbers);
                    numToString(num);
                    if(descending.isSelected()) 
                    {
                            for (int i = num-1; i >= 0;i --)
                            {
                                    listModel2.addElement(array[i]);
                            }

                    }
                    else 
                    {
                            for (int i = 0; i < num;i ++)
                            {
                                    listModel2.addElement(array[i]);
                            }

                    }

                    NumList2 = new JList(listModel2);
                    listScroll2 = new JScrollPane(NumList2);
                    shell.setSelected(false);
                    frame.dispose(); // getting rid of the prev frame
                    GUILayout(); // refreshing the frame to show the current array

            }

            else if (heap.isSelected()) // radio button is selected
            {
                    int num = Integer.parseInt(data); // parsing input to int
                    listModel.removeAllElements(); //removing all elements from the list
                    listModel2.removeAllElements();
                    randNumGen(num); // generating random numbers to arrays
                    numToString(num); // converting numbers array  to string array
                    NumList = new JList(array); //creating a list
                    listModel = new DefaultListModel();
                    for (int i = 0; i< num;i ++) // adding elements to the list
                    {
                            listModel.addElement(array[i]);
                    }
                    NumList = new JList(listModel);
                    listScroll = new JScrollPane(NumList);
                    HeapSort(numbers);
                    numToString(num);
                    if(descending.isSelected()) 
                    {
                            for (int i = num-1; i >= 0;i --)
                            {
                                    listModel2.addElement(array[i]);
                            }

                    }
                    else 
                    {
                            for (int i = 0; i < num;i ++)
                            {
                                    listModel2.addElement(array[i]);
                            }

                    }

                    NumList2 = new JList(listModel2);
                    listScroll2 = new JScrollPane(NumList2);
                    heap.setSelected(false);
                    frame.dispose(); // getting rid of the prev frame
                    GUILayout(); // refreshing the frame to show the current array
                   
            }

            if(!data2.equals("")) // if the text input box is not null
            {
                int num2 = Integer.parseInt(data2); // convert the input from string to int
                for (int i = 0; i < numbers.length; i++ ) // for testing array values
                {
                //System.out.println(numbers[i]);

                }
                if (binarySearch(numbers, num2) != -1) // if the binary search function does not yeild -1
                {
                        lblDisplay.setText("Location: " + Integer.toString(binarySearch(numbers, num2)));
                        // display the index value
                }

                if (binarySearch(numbers, num2) == -1) // if the binary search function yeilds -1
                {
                        lblDisplay.setText("Value does not exist");// display value not found in the array
                }
            }


        } 

    }



    static void insertion(int array[]) // insertion sorting 
    {		
            int n = array.length;  
            for (int i = 1; i < n; i++) 
            {  
                    int key = array[i];  
                    int j = i-1;  
                    while ( (j > -1) && ( array [j] > key ) ) 
                    {  
                        comparisons +=1;   
                        array [j+1] = array [j];  
                        j--;  
                    }  
                    array[j+1] = key;  

            }

    }

    static void randNumGen(int length) // random number generator from -1000 to 1000 exlcusive
    {
            numbers =  new int [length];
            int rand;
            int range = (1000 - (-1000)) + 1;     

            for (int l = 0; l < length; l++)
            {

                    rand = (int)(Math.random() * range) -1000; // yeild pseudorandom numbers from -1000 to 1000

                    numbers[l] = rand;

            }

    }

    static void numToString(int p) //conversion from int array to string array for output
    {
            array = new String[p];
            for (int k = 0; k < p; k++)
            {
                    array[k] = Integer.toString(numbers[k]);



            }


    }


    static int QuickPartition(int array[], int low, int high) //quick sort partition
    {			
            int pivot = array[high];  
            int i = (low-1); // index of smaller element 
            for (int j=low; j<high; j++) 
            { 
                    // If current element is smaller than the pivot 
                    if (array[j] < pivot) 
                    { 
                            i++; 

                            // swap arr[i] and arr[j] 
                            int temp = array[i]; 
                            array[i] = array[j]; 
                            array[j] = temp; 
                            comparisons +=1;
                    } 
            } 

            // swap arr[i+1] and arr[high] (or pivot) 
            int temp = array[i+1]; 
            array[i+1] = array[high]; 
            array[high] = temp; 

            return i+1; 

    }

    static void QuickSort(int array[], int low, int high) //quick sort
    { 
            if (low < high) 
            { 
                    // pi is partitioning index, arr[pi] is  now at right place 
                    int pi = QuickPartition(array, low, high); 

                    // Recursively sort elements before 
                    // partition and after quick
                    QuickSort(array, low, pi-1); 
                    QuickSort(array, pi+1, high); 
            } 
    } 



    static void merge(int array[], int beg, int mid, int end) // merge sort
    {
            int intLeftL = mid - beg + 1; // the left array length is mid - beginning(0) +1
            int intRightL = end - mid; // the right array length is length - mid

            int intLeftArray[] = new int[intLeftL]; // declaring the left array
            int intRightArray[] = new int[intRightL]; // declaring the right array

            for (int i = 0; i <  intLeftL; i++) // transferring the "left side" of the original array to the left array
            {
                intLeftArray[i] = array[beg+i];
            }

            for (int k = 0; k <  intRightL; k++) // transferring the "right side" of the original array to the left
            {
                intRightArray[k] = array[mid + 1 + k];
            }


            int i = 0; int j = 0;
            int k = beg;
            while (i<intLeftL&&j<intRightL)  
            {  
                    if (intLeftArray[i] <= intRightArray[j])  
                    {  
                            array[k] = intLeftArray[i];  
                            i++;  
                    }  
                    else  
                    {  
                            array[k] = intRightArray[j];  
                            j++;  
                    }  
                    k++;  
                    comparisons +=1;
            }  
            while (i<intLeftL)  
            {  
                    array[k] = intLeftArray[i];  
                    i++;  
                    k++;  
            }  

    }
    //part of merge sort 
    static void MergeSort(int array[], int beg, int end ) // merging the 2 arrays (left and right)
    {
            if (beg < end)
            {
                    int mid = (beg + end)/2;
                    MergeSort(array, beg, mid);
                    MergeSort(array, mid+1, end);
                    merge(array, beg, mid, end);
            }

    }


    //selection sort
    static void SelectionSort(int array[])
    {
        int n = array.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
            {   
                if (array[j] < array[min_idx]) 
                {
                    comparisons +=1;
                    min_idx = j;
                }
            }
            // Swap the found minimum element with the first 
            // element 
            int temp = array[min_idx]; 
            array[min_idx] = array[i]; 
            array[i] = temp; 
        } 

    }
    // part of the selection sort
    

    //shell sort
    static int ShellSort(int arr[])  // shell sort
    { 
            int n = arr.length; 

            // Start with a big gap, then reduce the gap 
            for (int gap = n/2; gap > 0; gap /= 2) 
            { 
                    // Do a gapped insertion sort for this gap size. 
                    // The first gap elements a[0..gap-1] are already 
                    // in gapped order keep adding one more element 
                    // until the entire array is gap sorted 
                    for (int i = gap; i < n; i += 1) 
                    { 
                            // add a[i] to the elements that have been gap 
                            // sorted save a[i] in temp and make a hole at 
                            // position i 
                            int temp = arr[i]; 

                            // shift earlier gap-sorted elements up until 
                            // the correct location for a[i] is found 
                            int j; 
                            for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) 
                                    arr[j] = arr[j - gap]; 

                            // put temp (the original a[i]) in its correct 
                            // location 
                            arr[j] = temp; 
                            comparisons +=1;
                    } 
                    
            } 
            return 0; 
    } 


    public static void HeapSort(int arr[]) //heap sort
    { 
            int n = arr.length; 

            // Build heap (rearrange array) 
            for (int i = n / 2 - 1; i >= 0; i--) 
            heap(arr, n, i); 

            // One by one extract an element from heap 
            for (int i=n-1; i>0; i--) 
            { 
                // Move current root to end 
                int temp = arr[0]; 
                arr[0] = arr[i]; 
                arr[i] = temp; 

                // call max heapify on the reduced heap 
                heap(arr, i, 0); 
            } 
    } 

    // To heap a subtree rooted with node i which is 
    // an index in arr[]. n is size of heap 
    static void heap(int array[], int n, int i) 
    { 
            int largest = i; // Initialize largest as root 
            int left = 2*i + 1; // left = 2*i + 1 
            int right = 2*i + 2; // right = 2*i + 2 

            // If left child is larger than root 
            if (left < n && array[left] > array[largest]) 
                    largest = left; 

            // If right child is larger than largest so far 
            if (right < n && array[right] > array[largest]) 
                    largest = right; 

            // If largest is not root 
            if (largest != i) 
            { 
                    int swap = array[i]; 
                    array[i] = array[largest]; 
                    array[largest] = swap; 

                    // Recursively heap the affected sub-tree 
                    heap(array, n, largest);
                    comparisons +=1;
            } 
    } 


    static int binarySearch(int array[], int num2) // binary search
    {
        //arrays need to  be sorted for binary searches to work
            int high = array.length;  // highest possible value in the array is the length
            int low = -1; // lowest possible value in the array is -1 
            int mid; // middle of the array
            while(high-low > 1)
            {
                    mid =  (high + low)/2; // mid is the average btwn the highest and lowest value

                    if (array[mid]> num2) // if the target number is less than the middle number
                    {
                            high = mid; // set high to mid

                    }

                    else // if the target number greater than the middle number
                    {
                            low = mid; // set the low value to mid
                    }

            }
            if (low == -1 || array[low] != num2) // if low is -1 or the array [index low] is not the target number 
            {
                    return -1; // return -1 which would return "no values found"

            }

            else 
            {
                    return low; // return the low which is = to the index of the target number
            }

    }



}


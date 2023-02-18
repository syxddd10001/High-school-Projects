package com.mycompany.guiswingtest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;


public class mainClass {

	//varaibles
	static int numbers[];
	static int size;
	static String array[];
	static JLabel lblText1 = new JLabel("");
	static JLabel lblText2 = new JLabel("");
	static JLabel lblText3 = new JLabel("");
	static JLabel lblText4 = new JLabel("Enter the value you're looking for ");
	static JLabel lblText5 = new JLabel("");
	static JLabel lblText6 = new JLabel("");
	static JLabel lblDisplay = new JLabel("-");

	static JButton btn1 = new JButton("SORT");
	static JButton btn2 = new JButton("SEARCH");
	static JFormattedTextField txtInput = new JFormattedTextField();
	static String data = txtInput.getText();
	static JFormattedTextField txtInput2 = new JFormattedTextField();
	static String data2 = txtInput.getText();
	static JRadioButton insertion = new JRadioButton("Insertion Sort",false);
	static JRadioButton quick = new JRadioButton("Quick Sort",false);
	static JRadioButton merge = new JRadioButton("Merge Sort",false);
	static JRadioButton selection = new JRadioButton("Selection Sort",false);
	static JRadioButton shell = new JRadioButton("Shell Sort",false);
	static JRadioButton heap = new JRadioButton("Heap Sort",false);
	
	static JRadioButton ascending = new JRadioButton("Ascending", true);
	static JRadioButton descending = new JRadioButton("Descending", false);
	 
	
	
	static JScrollPane listScroll = new JScrollPane(); 
	static JScrollPane listScroll2 = new JScrollPane();
	static DefaultListModel listModel = new DefaultListModel();
	static DefaultListModel listModel2 = new DefaultListModel();
	static JList NumList = new JList(listModel);
	static JList NumList2 = new JList(listModel2);
	static JFrame frame = new JFrame("SORTING LAYOUT");         

	static JPanel NORTHPanel = new JPanel(); 
	static JPanel WESTPanel = new JPanel();
	static JPanel EASTPanel = new JPanel();



	//methods

	private static void GUILayout()
	{

		frame = new JFrame("Flow Layout");         
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

		NORTHPanel = new JPanel(); 
		WESTPanel = new JPanel();
		EASTPanel = new JPanel();
		//set Layout managers 
		NORTHPanel.setLayout(new BoxLayout(NORTHPanel, BoxLayout.PAGE_AXIS)); 
		WESTPanel.setLayout(new BoxLayout(WESTPanel, BoxLayout.PAGE_AXIS)); 
		EASTPanel.setLayout(new BoxLayout(EASTPanel, BoxLayout.PAGE_AXIS));

		lblText1 = new JLabel("Set size: ");
		lblText2 = new JLabel("Unsorted: ");
		lblText3 = new JLabel("Sorted: ");
		//text inputs and parsing
		lblDisplay = new JLabel(" ");
		ButtonHandler onClick = new ButtonHandler();  
		ButtonHandler onClick1 = new ButtonHandler();
		//attach an event listener to the button    
		btn1.addActionListener(onClick); 		
		btn2.addActionListener(onClick1); 	
		
		
		
		
		NumList = new JList(listModel);

		listScroll = new JScrollPane(NumList);
		listScroll2 = new JScrollPane(NumList2);
		//buttons and labels
		//add components to bottomPanel
		NORTHPanel.add(lblText1);
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
		EASTPanel.add(lblText4);
		EASTPanel.add(txtInput2);
		EASTPanel.add(btn2);
		EASTPanel.add(lblDisplay);
		txtInput.selectAll();
		Container contentPane = frame.getContentPane();//add each panel 
		contentPane.add(NORTHPanel,BorderLayout.NORTH); 
		contentPane.add(WESTPanel, BorderLayout.WEST);
		contentPane.add(EASTPanel, BorderLayout.EAST);
		frame.setSize(600,500);
		frame.setVisible(true);
	}
	public static void main(String[] args) 
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
	{

		public void actionPerformed(ActionEvent e)
		{
			String data = txtInput.getText();
			
			String data2 = txtInput2.getText();


			if (insertion.isSelected()) 
			{ 
				int num = Integer.parseInt(data);
				listModel.removeAllElements();
				listModel2.removeAllElements();
				randNumGen(num);
				numToString(num);
				NumList = new JList(array);
				listModel = new DefaultListModel();
				for (int i = 0; i< num;i ++)
				{
					listModel.addElement(array[i]);
				}
				NumList = new JList(listModel);
				listScroll = new JScrollPane(NumList);
				insertion(numbers);
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
			
				insertion.setSelected(false);
				frame.dispose();
				GUILayout();

			} 

			else if (quick.isSelected())
			{
				int num = Integer.parseInt(data);
				listModel.removeAllElements();
				listModel2.removeAllElements();
				randNumGen(num);
				numToString(num);
				NumList = new JList(array);
				listModel = new DefaultListModel();
				for (int i = 0; i< num;i ++)
				{
					listModel.addElement(array[i]);
				}
				NumList = new JList(listModel);
				listScroll = new JScrollPane(NumList);
				QuickSort(numbers, 0, num-1);
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
				quick.setSelected(false);
				frame.dispose();
				GUILayout();


			}


			else if (merge.isSelected())
			{

				int num = Integer.parseInt(data);
				listModel.removeAllElements();
				listModel2.removeAllElements();
				randNumGen(num);
				numToString(num);
				NumList = new JList(array);
				listModel = new DefaultListModel();
				for (int i = 0; i< num;i ++)
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
				frame.dispose();
				GUILayout();

			}

			else if (selection.isSelected())
			{
				int num = Integer.parseInt(data);
				listModel.removeAllElements();
				listModel2.removeAllElements();
				randNumGen(num);
				numToString(num);
				NumList = new JList(array);
				listModel = new DefaultListModel();
				for (int i = 0; i< num;i ++)
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
				frame.dispose();
				GUILayout();

			}

			else if (shell.isSelected())
			{
				int num = Integer.parseInt(data);
				listModel.removeAllElements();
				listModel2.removeAllElements();
				randNumGen(num);
				numToString(num);
				NumList = new JList(array);
				listModel = new DefaultListModel();
				for (int i = 0; i< num;i ++)
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
				frame.dispose();
				GUILayout();

			}

			else if (shell.isSelected())
			{
				int num = Integer.parseInt(data);
				listModel.removeAllElements();
				listModel2.removeAllElements();
				randNumGen(num);
				numToString(num);
				NumList = new JList(array);
				listModel = new DefaultListModel();
				for (int i = 0; i< num;i ++)
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
				frame.dispose();
				GUILayout();

			}

			else if (heap.isSelected())
			{
				int num = Integer.parseInt(data);
				listModel.removeAllElements();
				listModel2.removeAllElements();
				randNumGen(num);
				numToString(num);
				NumList = new JList(array);
				listModel = new DefaultListModel();
				for (int i = 0; i< num;i ++)
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
				frame.dispose();
				GUILayout();

			}

			if(!data2.equals(""))
			{
				int num2 = Integer.parseInt(data2);
				if (binarySearch(numbers, num2) != -1)
				{
					lblDisplay.setText(Integer.toString(binarySearch(numbers, num2)));
				}
				
				if (binarySearch(numbers, num2) == -1)
				{
					lblDisplay.setText("Value does not exist");
				}
			}


		} 

	}



	static void insertion(int array[])
	{		
		int n = array.length;  
		for (int i = 1; i < n; i++) 
		{  
			int key = array[i];  
			int j = i-1;  
			while ( (j > -1) && ( array [j] > key ) ) 
			{  
				array [j+1] = array [j];  
				j--;  
			}  
			array[j+1] = key;  

		}

	}

	static void randNumGen(int length)
	{
		numbers =  new int [length];
		int rand;
		int range = (1000 - (-1000)) + 1;     
	  
		for (int l = 0; l < length; l++)
		{
			
			rand = (int)(Math.random() * range) -1000;
			
			numbers[l] = rand;

		}

	}

	static void numToString(int p) 
	{
		array = new String[p];
		for (int k = 0; k < p; k++)
		{
			array[k] = Integer.toString(numbers[k]);



		}


	}


	static int QuickPartition(int array[], int low, int high)
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
			} 
		} 

		// swap arr[i+1] and arr[high] (or pivot) 
		int temp = array[i+1]; 
		array[i+1] = array[high]; 
		array[high] = temp; 

		return i+1; 

	}

	static void QuickSort(int array[], int low, int high) 
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



	static void merge(int array[], int beg, int mid, int end)
	{
		int intLeftL = mid - beg + 1;
		int intRightL = end - mid;

		int intLeftArray[] = new int[intLeftL];
		int intRightArray[] = new int[intRightL];

		for (int i = 0; i <  intLeftL; i++)
		{
			intLeftArray[i] = array[beg+i];
		}

		for (int k = 0; k <  intRightL; k++)
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
		}  
		while (i<intLeftL)  
		{  
			array[k] = intLeftArray[i];  
			i++;  
			k++;  
		}  

	}
	//part of merge sort 
	static void MergeSort(int array[], int beg, int end )
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
		int intLength = array.length;


		for (int n = 0; n  < intLength -2; n++)
		{
			for(int m = n+1; m < intLength-1; m++)
			{
				if (array[m] < array[n])
				{
					SelectionSwap(array, n, m);

				}


			}


		}

	}
	// part of the selection sort
	static void SelectionSwap(int array[], int n, int m)
	{
		int temp = array[n];
		array[n] = array[m];
		array[m] = temp;
	}


	//shell sort
	static int ShellSort(int arr[]) 
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
			} 
		} 
		return 0; 
	} 


	public static void HeapSort(int arr[]) 
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

	// To heapify a subtree rooted with node i which is 
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

			// Recursively heapify the affected sub-tree 
			heap(array, n, largest); 
		} 
	} 

	
	static int binarySearch(int array[], int num2)
	{
		int high = array.length;  
		int low = -1;
		int mid;
		while(high-low > 1)
		{
			mid =  (high + low)/2;
			
			if (array[mid]> num2)
			{
				high = mid;
				
			}
			
			else 
			{
				low = mid;
			}
			
			
			
			
		}
		if (low == -1 || array[low] != num2)
		{
			return -1;
			
		}
		
		else 
		{
			return low;
		}
		
	}
	


}

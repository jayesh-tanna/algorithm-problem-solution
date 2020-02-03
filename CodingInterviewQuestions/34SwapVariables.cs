/*
Swap two variables without using third variable
*/


public void Swap(int a,int b)
{
a = a + b;
b = a - b;
a = a - b;
Console.WriteLine(a);
Console.WriteLine(b);
}

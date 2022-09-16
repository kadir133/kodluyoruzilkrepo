
Console.WriteLine("Kaç elemanlı bir seri olmalı ?");
var length = Console.ReadLine();

var a = 0;
var b = 1;
var c = 0;
var total = 0;
ArrayList fibo = new ArrayList();

for (int i = 0; i < length; i++)
{
    c = a + b;
    a = b;
    b = c;

    toplam = toplam + c;

    fibo.Add(c);
}


Console.WriteLine("serinin elemanları");
foreach (var item in fibo)
{
    Console.WriteLine(item);
}

Console.WriteLine("serinin ortalaması:");

int ortlama = toplam / entry + 1;

Console.WriteLine(ortlama);
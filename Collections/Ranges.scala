object Ranges extends App
{
    val r1 = 1 to 10    //1 to 10 both enclusive
    val r2 = 1 until 10  //1 to 9
    
    println("r1:" + r1)
    println("r2:" + r2)
    println("r2.head :" + r2.head)
    println("r2.tail:" + r2.tail)
    
    println("2 to 10 by 2 :" + (2 to 10 by 2))
    println("10 to 2 by -2 :" + (10 to 2 by -2))
    
    val r5 = ('a' to 'z') ++ ('A' to 'Z')
    println("('a' to 'z') ++ ('A' to 'Z') :" + r5)
    
    println("Range(1, 10) : " + Range(1, 10))       //by default, Range will exclude last digit
    println("Range(1, 10, 2) : " + Range(1, 10, 2))
    
    println("Range.inclusive(2, 10) : " + Range.inclusive(2, 10))
    println("Range.inclusive(2, 10, 2) : " + Range.inclusive(2, 10, 2))
    
    //iterating over Range using for loop
    for(i <- 1 to 10){ print(i + 1 ); print(" ")}
    println()
    for(i <- 2 to 10 by 2) { print(i + 1 ); print(" ")}
}


/**
    Sample Output
r1:Range(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
r2:Range(1, 2, 3, 4, 5, 6, 7, 8, 9)
r2.head :1
r2.tail:Range(2, 3, 4, 5, 6, 7, 8, 9)
2 to 10 by 2 :Range(2, 4, 6, 8, 10)
10 to 2 by -2 :Range(10, 8, 6, 4, 2)
('a' to 'z') ++ ('A' to 'Z') :Vector(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B,
 C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z)
Range(1, 10) : Range(1, 2, 3, 4, 5, 6, 7, 8, 9)
Range(1, 10, 2) : Range(1, 3, 5, 7, 9)
Range.inclusive(2, 10) : Range(2, 3, 4, 5, 6, 7, 8, 9, 10)
Range.inclusive(2, 10, 2) : Range(2, 4, 6, 8, 10)
2 3 4 5 6 7 8 9 10 11
3 5 7 9 11

**/

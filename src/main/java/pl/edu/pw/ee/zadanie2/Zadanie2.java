package pl.edu.pw.ee.zadanie2;

    /*
     * Mój sposób rozwiązania zadania opierał się o implementację stosu, zadanie
     * polega na znalezieniu par nawiasów w ciągu. Na stos wrzucam nawiasy otwierające '('
     * i jeżeli trafię w ciągu na nawias zamykająy usuwam ze stosu jeden nawias otwierający.
     * Jeżeli na koniec stos nie jest pusty zwracam false (zostały na stosie jakieś 
     * nawiasy otwierające bez pary). Jeżeli chcemy zdjąć ze stosu nawias, a stos
     * jest pusty, oznacza to tyle że mamy nawias zamykający który nie ma do pary
     * nawiasu otwierającego, zwracamy więc false. Dodatkowo jeżeli podamy
     * null, zwracamy false. Pesymistyczna złożoność obliczeniowa wynosi O(n), ponieważ
     * tylko raz przechodzimy przez ciąg. Pesymistyczna złożoność pamięciowa wynosi
     * O(n) ponieważ może się okazać że cały ciąg zawiera nawiasy otwierające i nic więcej,
     * w tym drugim przypadku można się pokusić o delikatną optymalizację.
     */
public class Zadanie2 {
    
    public static boolean solve(String ciag){
        if (ciag == null) return false;
        Stos stos = new Stos();
        for(Character c : ciag.toCharArray()){
            switch (c) {
                case '(':
                    stos.push(c);
                    break;
                case ')':
                    Character cr = stos.pop();
                    if (cr == null) return false;
                    break;
            }
        }
        return stos.size() == 0;
    }
    
}

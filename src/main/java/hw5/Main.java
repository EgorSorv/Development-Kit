package hw5;

/**
 * 1. Пять безмолвных философов сидят вокруг круглого стола, перед каждым философом стоит тарелка спагетти.<br>
 * 2. Вилки лежат на столе между каждой парой ближайших философов.<br>
 * 3. Каждый философ может либо есть, либо размышлять.<br>
 * 4. Философ может есть только тогда, когда держит две вилки — взятую справа и слева.<br>
 * 5. Философ не может есть два раза подряд, не прервавшись на размышления (можно не учитывать)
 * <p>
 * Описать в виде кода такую ситуацию. Каждый философ должен поесть три раза
 */

public class Main {
    public static void main(String[] args) {
        Table table = new Table();
        table.start();
    }
 }

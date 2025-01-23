package lesson_21;

import lesson_13.Person;

import java.io.IOException;

public class Main {

    // 1. Remove pairs of adjacent letters - afghhgfdds -> afggfs -> affs -> as
    // xdaabbccdy -> xddy -> xy
    // input string, output string

    // 2. Check if the brackets are properly paired ([{}])
    // input string, output boolean
    // ()()()[]{{[]}} -> true
    // ((])[) -> false
    // ((({}{[]}))) -> true
    // )(
    public static void main(String[] args) {
        int status = 5;
        String message = switch (status) {
            case 1 -> {
                String finalMessage = "///";
                yield finalMessage;
            }
            case 2 -> "Sent...";
            case 3 -> "Delivered...";
            case 4 -> "Read...";
            default -> "Something......";
        };
    }

    private static void stuff() {
        FinalsChild child = new FinalsChild();
        FinalExample child2 = new FinalsChild();
        System.out.println(child instanceof FinalExample);
        System.out.println(child2 instanceof FinalExample);
        System.out.println(child2 instanceof FinalChildAnother);

        try (CloseableExample e = new CloseableExample(); CloseableExample e2 = new CloseableExample(); ) {
            e.randomMethod();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        CloseableExample.a = 50;
    }
}

package p03_telephony;

import java.util.LinkedList;
import java.util.List;

public class Smartphone implements Browseable, Callable{
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.setNumbers(numbers);
        this.setUrls(urls);
    }

    private void setNumbers(List<String> numbers) {
        if (numbers.size() == 0) {
            this.numbers = new LinkedList<>();
        }else {
            this.numbers = numbers;
        }
    }

    private void setUrls(List<String> urls) {
        if (urls.size() == 0) {
            this.urls = new LinkedList<>();
        }else {
            this.urls = urls;
        }
    }

    public List<String> getNumbers() {
        return this.numbers;
    }

    public List<String> getUrls() {
        return this.urls;
    }

    @Override
    public String browse(String url) {
        for (Character cc : url.toCharArray()) {
            if (Character.isDigit(cc)) {
                throw new IllegalArgumentException("Invalid URL!");
            }
        }
        return String.format("Browsing: %s!", url);
    }

    @Override
    public String call(String number) {
        for (Character cc : number.toCharArray()) {
            if (!Character.isDigit(cc)) {
                throw new IllegalArgumentException("Invalid number!");
            }
        }
        return String.format("Calling... %s", number);
    }
}

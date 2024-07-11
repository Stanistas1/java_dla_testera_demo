import model.computer.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainAppComputer {
    public static void main(String[] args) {

        List<Computer> computers = new ArrayList<>();
        computers.add(new Laptop("MB PRO 1", "PRO 1", new Hdd("SSD", 500), new Ram("HP", 128), 100));
        computers.add(new Laptop("MB PRO 2", "PRO 2", new Hdd("SSD", 500), new Ram("HP", 128), 100));
        computers.add(new Laptop("MB PRO 3", "PRO 3", new Hdd("SSD", 256), new Ram("HP", 128), 100));
        computers.add(new Laptop("MB PRO 4", "PRO 4", new Hdd("SSD", 500), new Ram("HP", 128), 100));
        computers.add(new PC("PC 1","BBB", new Hdd("HP", 500), new Ram("HP", 128)));
        computers.add(new PC("PC 2","AAA", new Hdd("HP", 256), new Ram("HP", 256)));
        computers.add(new PC("PC 3","PRO 3", new Hdd("HP", 500), new Ram("HP", 128)));

        long count = computers.stream()
                .filter(comp -> comp.getRam().getSize() > 128)
                .count();

        System.out.println(count);

        computers.stream()
                .map(Computer::getType)
                .forEach(System.out::println);

        Computer computer = computers.stream()
                .max(Comparator.comparingInt(comp -> comp.getRam().getSize()))
                .orElseThrow(() -> new IllegalStateException("Can not find any computer"));
        System.out.println(computer.getName());

        List<Computer> collect = computers.stream()
                .filter(comp -> comp.getHdd().getSize() < 500)
                .collect(Collectors.toList());

        for (Computer comp : collect) {
            System.out.println(comp.getName() + " " + comp.getHdd());
        }

        List<Computer> sorted = computers.stream()
                .sorted(Comparator.comparing(Computer::getName).thenComparing(Computer::getType))
                .collect(Collectors.toList());

        for (Computer comp : sorted) {
            System.out.println(comp.getName() + " " + comp.getType());
        }

    }
}

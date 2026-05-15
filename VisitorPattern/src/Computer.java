// 计算机类
import java.util.ArrayList;
import java.util.List;

public class Computer implements ComputerPart {
    private List<ComputerPart> parts;

    public Computer() {
        parts = new ArrayList<ComputerPart>();
        parts.add(new Mouse());
        parts.add(new Keyboard());
        parts.add(new Monitor());
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}

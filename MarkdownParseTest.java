import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void getLinksTestFile1() throws IOException {
        Path fileName = Path.of("C:/Users/andre/OneDrive/Documents/GitHub/markdown-parse/test-file.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(contents));
    }

    @Test
    public void getLinksTestFile2() throws IOException {
        Path fileName = Path.of("C:/Users/andre/OneDrive/Documents/GitHub/markdown-parse/test-file2.md");
        String contents = Files.readString(fileName);
        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(contents));
    }

    @Test
    public void getLinksTestFile3() throws IOException {
        Path fileName = Path.of("C:/Users/andre/OneDrive/Documents/GitHub/markdown-parse/test-file3.md");
        String contents = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(contents));
    }

    @Test
    public void getLinksTestFile4() throws IOException {
        Path fileName = Path.of("C:/Users/andre/OneDrive/Documents/GitHub/markdown-parse/test-file4.md");
        String contents = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(contents));
    }

    @Test
    public void getLinksTestFile5() throws IOException {
        Path fileName = Path.of("C:/Users/andre/OneDrive/Documents/GitHub/markdown-parse/test-file5.md");
        String contents = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(contents));
    }

    @Test
    public void getLinksTestFile6() throws IOException {
        Path fileName = Path.of("C:/Users/andre/OneDrive/Documents/GitHub/markdown-parse/test-file6.md");
        String contents = Files.readString(fileName);
        assertEquals(List.of("page.com"), MarkdownParse.getLinks(contents));
    }

    @Test
    public void getLinksTestFile7() throws IOException {
        Path fileName = Path.of("C:/Users/andre/OneDrive/Documents/GitHub/markdown-parse/test-file7.md");
        String contents = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(contents));
    }

    @Test
    public void getLinksTestFile8() throws IOException {
        Path fileName = Path.of("C:/Users/andre/OneDrive/Documents/GitHub/markdown-parse/test-file8.md");
        String contents = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(contents));
    }
}
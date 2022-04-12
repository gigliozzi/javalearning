package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Comments;
import entities.Post;

public class ProgramPost {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		for (int i = 0; i < 2; i++) {
			System.out.print("Enter title's post: ");
			String title = sc.nextLine();
			System.out.print("Enter the content: ");
			String content = sc.nextLine();
			System.out.print("Enter number's likes: ");
			Integer likes = sc.nextInt();
			Date moment = new Date();
			Post post = new Post(moment, title, content, likes);
			
			System.out.print("Enter the comment: ");
			Comments comment1 = new Comments(sc.nextLine());
			Comments comment2 = new Comments(sc.nextLine());
			post.addComment(comment1);
			post.addComment(comment2);
			System.out.println();
			System.out.println(post.getTitle());
			System.out.println(post.getLikes() + " likes" + " - " + sdf.format(post.getMoment()));
			System.out.println(post.getContent());
			System.out.println("Comments: ");
			System.out.println(comment1.getText());
			System.out.println(comment2.getText());
		}

		sc.close();
	}

}

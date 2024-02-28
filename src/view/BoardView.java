package view;

import builder.BoardBuilder;
import model.BoardDto;
import service.UtilService;

import java.util.ArrayList;
import java.util.List;

public class BoardView {
    public static void main() {
        List<BoardDto> articles = new ArrayList<>();
        UtilService util = serviceImpl.UtilService.getInstance();

        for(int i=0;i<5;i++){
            articles.add(new BoardBuilder()
                    .title(util.createRandomTitle())
                    .content(util.createRandomContent())
                    .writer(util.createRandomName())
                    .build());
        }

        for (BoardDto i : articles) {
            System.out.println(i.toString());
        }

        articles.forEach(i -> {
            System.out.println(i.toString());
        });

    }
}

package view;

import builder.BoardBuilder;
import model.BoardDto;
import service.UtillService;
import seviceImpl.UtillServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class BoardView {
    public static void main(String[] args) {
        List<BoardDto> articles = new ArrayList<>();
        UtillService util = UtillServiceImpl.getInstance();

        for(int i=0;i<5;i++){
            articles.add(new BoardBuilder()
                    .title(util.createRandomTitle())
                    .content(util.createRandomContent())
                    .writer(util.createRandomTitle())
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

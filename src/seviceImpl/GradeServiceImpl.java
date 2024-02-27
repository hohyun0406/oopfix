package seviceImpl;

import service.GradeService;

public class GradeServiceImpl implements GradeService {
    private static GradeService instance = new GradeServiceImpl();
    private GradeServiceImpl(){}

    public static GradeService getInstance() {
        return instance;
    }

    @Override
    public int getTotalScore() {
        return 0;
    }

    @Override
    public double findAvg() {
        return 0;
    }
}

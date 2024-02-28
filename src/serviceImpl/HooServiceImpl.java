package serviceImpl;

import repository.HooRepository;

public class HooServiceImpl {
    HooRepository hooRepository;

    public HooServiceImpl() {
        this.hooRepository = new HooRepository();
    }
}

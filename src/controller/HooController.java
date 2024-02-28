package controller;

import serviceImpl.HooServiceImpl;

public class HooController {
    HooServiceImpl hooService;

    public HooController() {
        this.hooService = new HooServiceImpl();
    }
}

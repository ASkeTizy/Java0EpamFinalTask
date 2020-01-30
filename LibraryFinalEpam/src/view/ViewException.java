package view;

class ViewException extends Exception {
    ViewException(Exception e) {
        System.out.println(e.getMessage());
    }
}

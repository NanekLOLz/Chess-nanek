
public abstract class ploca {

    int kordinata;

    ploca(int kordinata){
        this.kordinata = kordinata;
    }

    public abstract boolean jeZauzeto();

    public abstract figura koFigura();

    public static final class praznaPloca extends ploca{

        praznaPloca(int mjesto){
            super(mjesto);
        }

        @Override
        public boolean jeZauzeto(){
            return false;
        }

        @Override
        public figura koFigura(){
            return null;
        }

    }

}

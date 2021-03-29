import java.util.concurrent.BrokenBarrierException;

public class RepostarGasTask implements Runnable{
    private BarcoPetrolero petrolero;
    public RepostarGasTask(BarcoPetrolero petrolero){
        this.petrolero = petrolero;
    }

    @Override
    public void run() {
        try {
            ZonaCarga.getInstance().repostarGas(petrolero);
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

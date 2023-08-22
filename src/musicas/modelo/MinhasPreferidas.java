package musicas.modelo;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao() >=9){
            System.out.println(audio.getTitulo() + " É considerado o preferido por todos");
        } else{
            System.out.println(audio.getTitulo() + " É considerado o que todos estão curtindo");
        }
    }
}
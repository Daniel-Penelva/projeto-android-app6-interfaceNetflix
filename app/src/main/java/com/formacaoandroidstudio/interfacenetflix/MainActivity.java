package com.formacaoandroidstudio.interfacenetflix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *  Cores Padrões que Android oferece:
     *  Já existe cores padrões no Android. Logo, para criar uma cor no texto, basta ir
     *  no arquivo styles.xml e inserir o seguinte código xml:
     *   item name="android:textColor">@android:color/white</item
     *
     *
     *  Icones:
     *  Para adicionar icone, você vai em:
     *
     *  res > drawable (botão direito do mouse) > new > image Asset (define uma imagem
     *  usando o próprio Android Studio).
     *
     *  ou
     *
     *  res > drawable (botão direito do mouse) > new > Vector Asset (define uma imagem
     *  como vetor - essa imagem pode ser recriada sem perder qualidade com qlq
     *  tamanho). São imagens (icones) que o Android Studio oferece.
     *
     *  Ao clicar vai abrir uma janela: você pode escolher o 'Asset Type':
     *    -> Clip Art - utiliza icones de fora gratuita.
     *    -> Local File - você pode criar o seu proprio ícone.
     *
     *  Na opção 'Clip Art':
     *  Clicando em Clip Art vai abrir uma janela mostrando os inúmeros ícones que
     *  o Android oferece.
     *  Size define o tamanho do ícone.
     *  Color define a cor do item.
     *  Opacidade define a transparência do ícone.
     *
     *  Ao criar o icone é gerado o arquivo .xml desse icone na pasta drawable.
     *  Esse arquivo ao abri-lo é possível alterar propriedades do icone, por exemplo,
     *  o tamanho dele, a cor dele, etc...
     *
     *
     *  Para inserir o icone no design:
     *  No caso, vamos interligar a posição do icone com o textView, portanto,
     *  vamos clicar no textView e ir na propriedade 'drawable' que vai oferecer
     *  opções de posicionamento do icone referente ao textView. Vamos criar um
     *  'drawableBotton' através do 'Pick resources', ou seja, nesse diretorio vai
     *  estar o icone criado, basta escolhe-lo e clicar nele, logo o icone ficará
     *  abaixo do textView.
     *
     * */
}

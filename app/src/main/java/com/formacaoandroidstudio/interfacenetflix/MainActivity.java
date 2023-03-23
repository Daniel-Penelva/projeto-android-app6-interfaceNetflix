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
     *  Outra forma de inserir o icone é através do elemento 'imageView', ou seja,
     *  você vai arrastar o imageView no design e buscar pelo drawable o icone que você quer
     *  adicionar.
     *
     *
     *  Linha Guias (menus) - Guidelines - representa o símbolo (I) no activity_main.xml:
     *  Ou pode acessar clicando com o botão direito do mouse em cima do design:
     *  Helpers > vai aparecer as opções de guideline
     *
     *  Guideline são pontos de referências que podem ser configurados dentro do seu app, para
     *  te ajudar a construir um menu, por exemplo.
     *
     *  É possível manipular os valores do guideline pela propriedades da aba 'attributes', por exemplo,
     *  se aplicarmos uma guideline em porcentagem, basta ir na aba, 'attributes' e pesquisar por 'percent'
     *  que vai ser mostrado as propriedades 'layout_constraintGuide_percent' e entre outras propriedades.
     *
     *  Aplicando os icones na guideline:
     *  Basta arrastar as constraints na guideline.
     *
     *
     *  Sobre os icones:
     *  -> É importante criar um 'ContentDescription' (na aba attributes) que define uma função para que pessoas
     *  com problema visual possam entender ao usar o app. Ou seja, vai ser descrito cada componente do app que
     *  o usuário cego habilitar.
     *
     *  -> Uma outra funcionalidade que é bom aplicar nos icones é o recurso de Strings, ou seja, lá mesmo no
     *  'ContentDescription' no 'Pick resources' vamos criar uma 'New String Value', depois criar um resource name
     *  (por exemplo, menu_volume) e um resource value (por exemplo, volume).
     *
     *
     *  Componentes:
     *   SeekBar - Tem a função de marcar o tempo do filme. Seria um play de vídeo.
     *
     *  Dica: Formatar o código
     *   ctrl + alt + L
     *
     * */
}

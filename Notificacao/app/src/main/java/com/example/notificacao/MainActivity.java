package com.example.notificacao;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNotificarProg = (Button) findViewById(R.id.btnNotificacao);
        btnNotificarProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensagem = "50% de desconto.";
                String titulo = "Promoção!";
                notificarUsuario(mensagem, titulo);
            }

            // metodo notificarUsuario
            // Parâmetros do tipo texto: mensagem e titulo
            private  void notificarUsuario(String mensagem, String titulo){
                //Objeto notificação para receber os parâmetros e construir a estrutura da notificação
                NotificationCompat.Builder notificacao = new NotificationCompat.Builder(getBaseContext());
                //construindo o titulo da notificação
                notificacao.setContentTitle(mensagem);
                //construindo a prioridade da notificação
                notificacao.setPriority(Notification.PRIORITY_HIGH);
                //construindo o icone da notificação
                notificacao.setSmallIcon(R.drawable.ic_launcher_foreground);
                //Quando o usuário clicar na notificação, ela será exluída da gaveta de notificações
                notificacao.setAutoCancel(true);
                //Construindo a intenção que chama a Activity promoção
                //quando o usuário clicar na mensagem
                Intent it = new Intent(getBaseContext(), promocao.class);
                //Utilizando o pendinIntent pra qu o Android consiga executar a activity do meu projeto

                PendingIntent pit = PendingIntent.getActivity(getBaseContext(), 100, it, PendingIntent.FLAG_UPDATE_CURRENT);
                //Atribuindo na notificação a intenção que será executada, quando o usuário clicar em notificação
                notificacao.setContentIntent(pit);
                //Criando um objeto para gerenciar e gerar a notficação no Android
                NotificationManager notificar = (NotificationManager)
                        getBaseContext().getSystemService(Context.NOTIFICATION_SERVICE);
                //EXECUTANDO A NOTIFICAÇÃO COM O ID FIXO: 9000

                notificar.notify(9000, notificacao.build());
            }

        });
        Button btnNotificarProg2 = (Button) findViewById(R.id.btnNotificacao2);
        btnNotificarProg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensagem = "80% de desconto.";
                String titulo = "Promoção!";
                notificarUsuario(mensagem, titulo);
            }

            // metodo notificarUsuario
            // Parâmetros do tipo texto: mensagem e titulo
            private  void notificarUsuario(String mensagem, String titulo){
                //Objeto notificação para receber os parâmetros e construir a estrutura da notificação
                NotificationCompat.Builder notificacao = new NotificationCompat.Builder(getBaseContext());
                //construindo o titulo da notificação
                notificacao.setContentTitle(mensagem);
                //construindo a prioridade da notificação
                notificacao.setPriority(Notification.PRIORITY_HIGH);
                //construindo o icone da notificação
                notificacao.setSmallIcon(R.drawable.ic_launcher_foreground);
                //Quando o usuário clicar na notificação, ela será exluída da gaveta de notificações
                notificacao.setAutoCancel(true);
                //Construindo a intenção que chama a Activity promoção
                //quando o usuário clicar na mensagem
                Intent it = new Intent(getBaseContext(), promocao.class);
                //Utilizando o pendinIntent pra qu o Android consiga executar a activity do meu projeto

                PendingIntent pit = PendingIntent.getActivity(getBaseContext(), 100, it, PendingIntent.FLAG_UPDATE_CURRENT);
                //Atribuindo na notificação a intenção que será executada, quando o usuário clicar em notificação
                notificacao.setContentIntent(pit);
                //Criando um objeto para gerenciar e gerar a notficação no Android
                NotificationManager notificar = (NotificationManager)
                        getBaseContext().getSystemService(Context.NOTIFICATION_SERVICE);
                //EXECUTANDO A NOTIFICAÇÃO COM O ID FIXO: 9090

                notificar.notify(9001, notificacao.build());
            }

        });
    }
}
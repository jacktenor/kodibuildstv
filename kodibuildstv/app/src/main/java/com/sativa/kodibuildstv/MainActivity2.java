package com.sativa.kodibuildstv;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.DownloadListener;
import com.androidnetworking.interfaces.DownloadProgressListener;

public class MainActivity2 extends MainActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button button10 = findViewById(R.id.button10);
        Button button11 = findViewById(R.id.button11);
        Button button12 = findViewById(R.id.button12);
        ImageButton mainmenu = findViewById(R.id.mainmenu);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);

        mainmenu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    public void onClick(View view) {

        int id = view.getId();

        if (id == R.id.button1) {
            Toast.makeText(MainActivity2.this, "You chose Streamline.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://whizkid.one/wizard/repository.WhizKid-1.1.0.zip",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() + "/KodiBuildsTV/WhizKid", "/repository.WhizKid-1.1.0.zip")
                    .setTag("DownloadStreamline")
                    .setPriority(Priority.MEDIUM)
                    .build()
                    .setDownloadProgressListener(new DownloadProgressListener() {
                        @Override
                        public void onProgress(long bytesDownloaded, long totalBytes) {
                            // do anything with progress
                        }
                    })
                    .startDownload(new DownloadListener() {
                        @Override
                        public void onDownloadComplete() {
                            Toast.makeText(MainActivity2.this, "Streamline is complete.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity2.this, "Streamline failed.", Toast.LENGTH_SHORT).show();
                        }
                    });

        } else if (id == R.id.button2) {
            Toast.makeText(MainActivity2.this, "You chose Xontech.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://teamfalcon.exposed/wizard/plugin.program.teamfalcon.zip",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() +"/KodiBuildsTV/Xontech", "/plugin.program.teamfalcon.zip")
                    .setTag("DownloadXontech")
                    .setPriority(Priority.MEDIUM)
                    .build()
                    .setDownloadProgressListener(new DownloadProgressListener() {
                        @Override
                        public void onProgress(long bytesDownloaded, long totalBytes) {
                            // do anything with progress
                        }
                    })
                    .startDownload(new DownloadListener() {
                        @Override
                        public void onDownloadComplete() {
                            Toast.makeText(MainActivity2.this, "Xontech is complete.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity2.this, "Xontech failed.", Toast.LENGTH_SHORT).show();
                        }
                    });

        } else if (id == R.id.button3) {
            Toast.makeText(MainActivity2.this, "You chose DaButcher.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://dabutcher.org/repo/repository.dab-1.2.zip",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() +"/KodiBuildsTV/DaButcher", "/repository.dab-1.2.zip")
                    .setTag("DownloadDaButcher")
                    .setPriority(Priority.MEDIUM)
                    .build()
                    .setDownloadProgressListener(new DownloadProgressListener() {
                        @Override
                        public void onProgress(long bytesDownloaded, long totalBytes) {
                            // do anything with progress
                        }
                    })
                    .startDownload(new DownloadListener() {
                        @Override
                        public void onDownloadComplete() {
                            Toast.makeText(MainActivity2.this, "DaButcher is complete.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity2.this, "DaButcher failed.", Toast.LENGTH_SHORT).show();
                        }
                    });

        } else if (id == R.id.button4) {
            Toast.makeText(MainActivity2.this, "You chose Innovation.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://kepler-22.github.io/repository.innovation-1.7.zip",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() +"/KodiBuildsTV/Innovation", "/repository.innovation-1.7.zip")
                    .setTag("DownloadInnovation")
                    .setPriority(Priority.MEDIUM)
                    .build()
                    .setDownloadProgressListener(new DownloadProgressListener() {
                        @Override
                        public void onProgress(long bytesDownloaded, long totalBytes) {
                            // do anything with progress
                        }
                    })
                    .startDownload(new DownloadListener() {
                        @Override
                        public void onDownloadComplete() {
                            Toast.makeText(MainActivity2.this, "Innovation is complete.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity2.this, "Innovation failed.", Toast.LENGTH_SHORT).show();
                        }
                    });

        } else if (id == R.id.button5) {
            Toast.makeText(MainActivity2.this, "You chose Joker.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://insanity-builds.tk/fracturedrepo/repository.fracturedrepo-0.2.7.zip",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() +"/KodiBuildsTV/Joker", "/repository.fracturedrepo-0.2.7.zip")
                    .setTag("DownloadJoker")
                    .setPriority(Priority.MEDIUM)
                    .build()
                    .setDownloadProgressListener(new DownloadProgressListener() {
                        @Override
                        public void onProgress(long bytesDownloaded, long totalBytes) {
                            // do anything with progress
                        }
                    })
                    .startDownload(new DownloadListener() {
                        @Override
                        public void onDownloadComplete() {
                            Toast.makeText(MainActivity2.this, "Joker is complete.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity2.this, "Joker failed.", Toast.LENGTH_SHORT).show();
                        }
                    });

        } else if (id == R.id.button6) {
            Toast.makeText(MainActivity2.this, "You chose DaBeast.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://thebeastbuild.com/download/thebeast.repostiroy.zip",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() +"/KodiBuildsTV/DaBeast", "/thebeast.repostiroy.zip")
                    .setTag("DownloadDaBeast")
                    .setPriority(Priority.MEDIUM)
                    .build()
                    .setDownloadProgressListener(new DownloadProgressListener() {
                        @Override
                        public void onProgress(long bytesDownloaded, long totalBytes) {
                            // do anything with progress
                        }
                    })
                    .startDownload(new DownloadListener() {
                        @Override
                        public void onDownloadComplete() {
                            Toast.makeText(MainActivity2.this, "DaBeast is complete.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity2.this, "DaBeast failed.", Toast.LENGTH_SHORT).show();
                        }
                    });

        } else if (id == R.id.button7) {
            Toast.makeText(MainActivity2.this, "You chose Last Kingdom.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://pedrokingdom.com/repo/repository.lk-1.1.zip",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() +"/KodiBuildsTV/LastKingdom", "/repository.lk-1.1.zip")
                    .setTag("DownloadLastKingdom")
                    .setPriority(Priority.MEDIUM)
                    .build()
                    .setDownloadProgressListener(new DownloadProgressListener() {
                        @Override
                        public void onProgress(long bytesDownloaded, long totalBytes) {
                            // do anything with progress
                        }
                    })
                    .startDownload(new DownloadListener() {
                        @Override
                        public void onDownloadComplete() {
                            Toast.makeText(MainActivity2.this, "Last Kingdom is complete.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity2.this, "Last Kingdom failed.", Toast.LENGTH_SHORT).show();
                        }
                    });

        } else if (id == R.id.button8) {
            Toast.makeText(MainActivity2.this, "You chose Titanium.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://www.supremebuilds.com/repo/repository.supremebuilds-1.0.2.zip",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() +"/KodiBuildsTV/Titanium", "/repository.supremebuilds-1.0.2.zip")
                    .setTag("DownloadTitanium")
                    .setPriority(Priority.MEDIUM)
                    .build()
                    .setDownloadProgressListener(new DownloadProgressListener() {
                        @Override
                        public void onProgress(long bytesDownloaded, long totalBytes) {
                            // do anything with progress
                        }
                    })
                    .startDownload(new DownloadListener() {
                        @Override
                        public void onDownloadComplete() {
                            Toast.makeText(MainActivity2.this, "Titanium is complete.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity2.this, "Titanium failed.", Toast.LENGTH_SHORT).show();
                        }
                    });

        } else if (id == R.id.button9) {
            Toast.makeText(MainActivity2.this, "You chose Resident Evil.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://racooncity.gq/repo/repository.racooncity-1.0.0.zip",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() +"/KodiBuildsTV/ResidentEvil", "/repository.racooncity-1.0.0.zip")
                    .setTag("DownloadResidentEvil")
                    .setPriority(Priority.MEDIUM)
                    .build()
                    .setDownloadProgressListener(new DownloadProgressListener() {
                        @Override
                        public void onProgress(long bytesDownloaded, long totalBytes) {
                            // do anything with progress
                        }
                    })
                    .startDownload(new DownloadListener() {
                        @Override
                        public void onDownloadComplete() {
                            Toast.makeText(MainActivity2.this, "Resident Evil is complete.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity2.this, "Resident Evil failed.", Toast.LENGTH_SHORT).show();
                        }
                    });

        } else if (id == R.id.button10) {
            Toast.makeText(MainActivity2.this, "You chose Kryptikz.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://www.lostkodi.appboxes.co/plugin.program.lostbuildswizard.zip",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() +"/KodiBuildsTV/Kryptikz", "/plugin.program.lostbuildswizard.zip")
                    .setTag("DownloadKryptikz")
                    .setPriority(Priority.MEDIUM)
                    .build()
                    .setDownloadProgressListener(new DownloadProgressListener() {
                        @Override
                        public void onProgress(long bytesDownloaded, long totalBytes) {
                            // do anything with progress
                        }
                    })
                    .startDownload(new DownloadListener() {
                        @Override
                        public void onDownloadComplete() {
                            Toast.makeText(MainActivity2.this, "Kryptikz is complete.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity2.this, "Kryptikz failed.", Toast.LENGTH_SHORT).show();
                        }
                    });

        } else if (id == R.id.button11) {
            Toast.makeText(MainActivity2.this, "You chose Badazz Media Center.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://www.midian.appboxes.co/repo/repository.Wherethemonsterslive.zip",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() +"/KodiBuildsTV/Badazz", "/repository.Wherethemonsterslive.zip")
                    .setTag("DownloadBadazz")
                    .setPriority(Priority.MEDIUM)
                    .build()
                    .setDownloadProgressListener(new DownloadProgressListener() {
                        @Override
                        public void onProgress(long bytesDownloaded, long totalBytes) {
                            // do anything with progress
                        }
                    })
                    .startDownload(new DownloadListener() {
                        @Override
                        public void onDownloadComplete() {
                            Toast.makeText(MainActivity2.this, "Badazz Media Center is complete.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity2.this, "Badazz Media Center failed.", Toast.LENGTH_SHORT).show();
                        }
                    });

        } else if (id == R.id.button12) {
            Toast.makeText(MainActivity2.this, "You chose Twisted Builds.", Toast.LENGTH_SHORT).show();
            AndroidNetworking.download("https://twistedbuilds.xyz/repo/repository.twisted-1.0.zip",Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath() +"/KodiBuildsTV/Twisted", "/repository.twisted-1.0.zip")
                    .setTag("DownloadTwisted")
                    .setPriority(Priority.MEDIUM)
                    .build()
                    .setDownloadProgressListener(new DownloadProgressListener() {
                        @Override
                        public void onProgress(long bytesDownloaded, long totalBytes) {
                            // do anything with progress
                        }
                    })
                    .startDownload(new DownloadListener() {
                        @Override
                        public void onDownloadComplete() {
                            Toast.makeText(MainActivity2.this, "Twisted Builds is complete.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onError(ANError error) {
                            Toast.makeText(MainActivity2.this, "Twisted Builds failed.", Toast.LENGTH_SHORT).show();
                        }
                    });
        }
    }
}









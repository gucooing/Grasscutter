package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.*;
import emu.grasscutter.net.proto.GetAllMailNotifyOuterClass.GetAllMailNotify;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketGetAllMailResultNotify;

@Opcodes(PacketOpcodes.GetAllMailNotify)
public final class HandlerGetAllMailNotify extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var req = GetAllMailNotify.parseFrom(payload);
        session.send(new PacketGetAllMailResultNotify(session.getPlayer(), req.getIsCollected()));
    }
}

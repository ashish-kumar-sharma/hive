<?php
namespace metastore;

/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class NotificationEventResponse
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'events',
            'isRequired' => true,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\NotificationEvent',
                ),
        ),
    );

    /**
     * @var \metastore\NotificationEvent[]
     */
    public $events = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['events'])) {
                $this->events = $vals['events'];
            }
        }
    }

    public function getName()
    {
        return 'NotificationEventResponse';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::LST) {
                        $this->events = array();
                        $_size745 = 0;
                        $_etype748 = 0;
                        $xfer += $input->readListBegin($_etype748, $_size745);
                        for ($_i749 = 0; $_i749 < $_size745; ++$_i749) {
                            $elem750 = null;
                            $elem750 = new \metastore\NotificationEvent();
                            $xfer += $elem750->read($input);
                            $this->events []= $elem750;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('NotificationEventResponse');
        if ($this->events !== null) {
            if (!is_array($this->events)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('events', TType::LST, 1);
            $output->writeListBegin(TType::STRUCT, count($this->events));
            foreach ($this->events as $iter751) {
                $xfer += $iter751->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
